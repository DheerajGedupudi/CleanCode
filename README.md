# Learning Object-Oriented Design and SOLID Principles with a Messenger Integration Example

This repository teaches object-oriented design and SOLID principles by implementing the same small messaging domain in two ways:
a deliberately flawed version under `violation` and a SOLID-aligned version under `solid`.

---

## Table of contents

* [Glossary](#glossary)
* [Project goals](#project-goals)
* [Learning goals](#learning-goals)
* [Domain overview](#domain-overview)
* [Repository layout](#repository-layout)
* [Violation implementation](#violation-implementation)
* [SOLID implementation](#solid-implementation)
* [Principle by principle comparison](#principle-by-principle-comparison)
* [Side-by-side summary](#side-by-side-summary)
* [How to extend the project](#how-to-extend-the-project)

---

## Glossary

* OOP: Object-oriented programming.
* SOLID: SRP, OCP, LSP, ISP, DIP.
* SRP: Single Responsibility Principle — one reason to change.
* OCP: Open/Closed Principle — open for extension, closed for modification.
* LSP: Liskov Substitution Principle — subtypes are substitutable for base types.
* ISP: Interface Segregation Principle — prefer small, focused interfaces.
* DIP: Dependency Inversion Principle — depend on abstractions, not concretions.
* Strategy: Encapsulate interchangeable behaviors behind a common interface.

---

## Project goals

* Provide a small domain to compare flawed and SOLID designs side by side
* Make violations visible with runnable, focused examples
* Keep the codebase small enough for exercises and experimentation

---

## Learning goals

After reading and running both versions, you should be able to:

* Recognize common design mistakes that violate SOLID
* Explain the concrete problems those mistakes create in real codebases
* Apply SOLID friendly alternatives using interfaces, composition, and abstractions
* Extend behavior by adding new classes rather than editing many existing files

---

## Domain overview

The domain models a minimal messenger app with two capability tiers:

* Basic messenger: send messages.
* Advanced messenger: send messages, set/display a profile picture, and mark all messages as read.

Message content is demonstrated with multiple styles:

* Text
* Emoji
* Hashtag

Profile pictures are demonstrated with multiple formats:

* JPEG
* PNG

---

## Repository layout

* `violation`
  Intentionally flawed design demonstrating common anti-patterns and SOLID violations

* `solid`
  SOLID-aligned design that fixes the same problems using small interfaces and abstractions

---


## Violation implementation

## Violation design overview

The violation version demonstrates typical shortcuts that break SOLID:

* A central service decides how to send based on conditionals (`MessengerService.send`)
* One large interface forces advanced capabilities onto all messengers
* High-level code depends on concrete types like JPEG

## Why it hurts

* Changes cluster in shared files, increasing conflicts and regressions
* Unsupported methods leak into the API and force defensive code
* Tight coupling makes testing and extension harder

## Violation walkthrough

What to observe when running:

* Sending behavior branches on message content
* Basic messengers expose operations they cannot support
* Profile picture handling is fixed to concrete types

## Takeaways

* Extensions require edits to existing files
* Exceptions replace real behavior
* Coupling stays high and tests get brittle

---

## SOLID implementation

## SOLID design overview

The SOLID version implements the same domain with a different structure:

* Message sending is a strategy (`SendMessage` with `SendText`, `SendEmoji`, `SendHashTag`)
* Interfaces are small and capability-based (`SendInterface`, `ProfilePicInterface`, `MarkAllAsReadInterface`)
* Profile pictures use an abstraction (`Photo` with `JPEG` and `PNG`)
* Concrete messengers compose behaviors (basic: send; advanced: send + profile picture + mark all as read)

## Why it works

* New behavior is added with new classes, not edits
* Each class has a single focus and a smaller test surface
* Callers rely on stable contracts instead of special cases

## SOLID walkthrough

What to observe when running:

* A messenger can switch message strategy at runtime
* Profile picture can switch between JPEG and PNG without changing messenger code
* Basic messengers only expose supported operations

---

## Principle by principle comparison

Compare the two folders directly by principle:

## SRP

* Violation: centralized message logic and mixed responsibilities
* SOLID: message styles and read behavior are isolated
* Better because: changes are localized and easier to test

## OCP

* Violation: new message or photo types require edits to existing code
* SOLID: extensions are additive through new classes
* Better because: existing code stays stable

## LSP

* Violation: some types promise operations they cannot support
* SOLID: basic and advanced messengers have different contracts
* Better because: callers can rely on the contract without special cases

## ISP

* Violation: one large interface forces unused methods
* SOLID: small interfaces per capability
* Better because: APIs are clearer and less error-prone

## DIP

* Violation: high-level code depends on concrete implementations
* SOLID: high-level code depends on abstractions (`SendMessage`, `Photo`)
* Better because: swapping implementations and testing is easier

---

## Side-by-side summary

| Topic                   | Violation                   | SOLID                              |
| ----------------------- | --------------------------- | ---------------------------------- |
| Extending message types | Edit conditionals           | Add a `SendMessage` implementation |
| Extending photo formats | Change core code            | Add a `Photo` subtype              |
| Safety                  | Runtime exceptions possible | Contracts match capabilities       |
| Coupling                | High                        | Low                                |
| Testing                 | Harder due to central logic | Easier due to isolated components  |

---

## How to extend the project

Add a new message style:

* Create a new class implementing `SendMessage`
* Inject it into a messenger in `solid/Main.java`

Add a new photo format:

* Create a new subclass of `Photo`
* Set it on an advanced messenger and display it

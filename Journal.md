# Journal
Phase 1

What did you accomplish in this phase, and what do you now understand about the difference between using a primitive int and an Integer wrapper class?

I was able to build the Artifact class! It sets a name, allows for unassigned IDs by using an Integer wrapper instead of a primitive int, and automatically tracks the total count every time a new artifact is created.

I learned that a primitive int can't be null, so using the Integer wrapper is what allows us to have unassigned IDs. Meanwhile, the static keyword is what actually tracks the total count across the whole program.


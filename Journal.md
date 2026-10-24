# Journal
Phase 1

What did you accomplish in this phase, and what do you now understand about the difference between using a primitive int and an Integer wrapper class?

I was able to build the Artifact class! It sets a name, allows for unassigned IDs by using an Integer wrapper instead of a primitive int, and automatically tracks the total count every time a new artifact is created.

I learned that a primitive int can't be null, so using the Integer wrapper is what allows us to have unassigned IDs. Meanwhile, the static keyword is what actually tracks the total count across the whole program.



Phase 2 

What did you accomplish in this phase? In your own words, how does a static final variable differ from a standard instance variable in terms of how it is shared across objects?

In this phase, I created the Universal Cataloging Constant using a double for decimals, final to make it read-only, and static so it belongs to the class instead of individual objects.

With static final variables you are able to apply to the entire class and this variable cannot be altered. Whereas with a standard instance variable it only applies to an individual object.


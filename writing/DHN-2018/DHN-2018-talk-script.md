Hello everyone, I'm Lawrence Evalyn, an English PhD here at U of T
I want to talk about some work I've been doing with the Computational Literature project at the University of Arkansas, overseen by Dr. Susan Gauch from the CSCE department there

I'm going to focus on what we made, rather than what we found, and I'm going to talk about what we made in two separate stages.
This is the first thing that we made: 37 social network graphs of the character interactions in Shakespeare's First Folio plays, plus Pericles

We generated this using a parser that takes in TEI encoded texts of those plays
The parser looks at character speech, supplemented with stage directions, to track which characters are on stage at any given moment
It draws a social network graph with characters as nodes, and speech as the edges connecting characters
Those edges are directional (to show the difference between speaking and hearing speech) and weighted by the number of words spoken, which lets us see a greater level of detail -- not just that Hamlet is centrally connected within his social circle, but that in most of his relationships he speaks a lot more than he listens.
We used Shakespeare because handmade social networks of plays like Hamlet already existed, which let us confirm that our networks are actually accurate before applying the parser to less-known texts.
The parser relies on TEI markup, but could be applied to any performance text marked up with the TEI schema, including those not in English.

My goal with these networks was to find out whether the social interactions between characters within a play could be broadly informative regarding the kind of story a play is telling, in its most basic plot structures.
So, the second phase of the project was developing a machine learning classifier to see if we could use the mathematical network graph features of these plays to identify their theatrical genres.

This took several tries, but we've had success with a support vector machine that uses three of the at least three of the 17 mathematical features we have calculated about each graph. 
This is a supervised machine learning method, which means it does need hand-classified training data,
but unlike the first phase of the project it does not rely on the source materials being theatrical scripts.
It could be applied to any corpus of network graphs; they don't even have to be social networks.

I've emphasized possible other materials to study because we're at a stage in the project where we're interested in broadening our applications. I'm still extremely interested in the changing role of the heroine in tragedies across the long eighteenth century, which is the next step in the project for me now that these elements are working,
but if you have TEI files of plays that you want to make into networks,  or network graphs that you want to use machine learning to classify, we would love to hear from you!
And, of course, I would be delighted to talk more about what we learned about Shakespeare and his "problem plays" if anybody would like to ask.

Thank you!
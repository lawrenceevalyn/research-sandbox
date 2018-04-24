Title: dh2018-shakespeare  
Author: Lawrence Evalyn

# final abstract (1200 wds) #

## intro: network = plot ##

# Introduction

Our inquiry considers the speech interactions of characters within plays as a proxy for broad narrative structures. We analyze computationally-generated social networks of 37 plays by Shakespeare to see whether, and how, they can be used to distinguish between Shakespeare’s comedies, tragedies, and histories.

Because dramatic performances enact social encounters, social network analysis translates surprisingly well to fictional societies. Stiller et al. have shown that social networks in Shakespeare’s plays mirror those of real human interactions, particularly in size, clustering, and maximum degrees of separation (2003). However, as fictions, these networks are shaped not only by sociological principles, but also by narrative structures. Moretti uses social networks to examine the plots of three Shakespearean tragedies, and to contrast the structure of chapters in English and Chinese novels (2011). Alberich et al. (2002) and Sparavigna (2013) also discuss the interplay between social and narrative constraints on networks. We emphasize this distinction to look for specifically literary features of our networks.

Recent papers presented at DH2017 sought ways to richly quantify the details of one or two plays (Fischer et al. 2017, Tonra et al. 2017). At another scale, Algee-Hewitt examined 3,439 plays by looking only at the Gini Coefficient of each play’s eigenvector centrality (2017). With our three dozen plays, we attempt to strike a fruitful middle ground in the inevitable balancing act between detail and scale. Each play is considered individually, but at a level of abstraction which allows rapid and direct comparisons.

## parser ##

# Methods

## Creating the Social Network Graphs

We built a parser that turns TEI-encoded plays into social network graphs.

Our parser uses the <role> and <who> tags to build a cast list for each play, and proceeds through the play using <div> tags to determine scene boundaries. Scenes are further subdivided into “blocks” based on character exits and entrances, to track who is on stage throughout the scene. If a character speaks or is mentioned in a stage direction, and has not been named in an exit, they are assumed to be present on stage and able to hear all speech.
Each speaking character is connected to all the characters present to hear their speech, with characters as nodes and shared scenes as edges.


weighted by the total number of shared scenes between two characters.


## validated on shakey ##

We started with Shakespeare because there’s a lot of work on Shakespeare. Our Hamlet graph matches Moretti’s, and ditto his other tragedy graphs.

## networks can ID genre ##

Using fivefold validation, we were able to show that social networks can be used to identify whether plays are labelled as tragedy, history, comedy. We considered 17 different mathematical features of the networks; no one feature was sufficient to identify the genre, though “graph density” came closest (83% accuracy). One combination which does achieve 100% accuracy is “edges, words, and degree”. (Other combos might also be able to do it, including maybe a pair, but one combo is sufficient to prove that ID based on network is possible.)

## IDs illuminate problem plays ##

With this preliminary validation we can step back and look at Shakespeare’s various contested genres. The “problem plays” look unproblematically like comedies, suggesting that it’s their content rather than their form which makes them problematic. Similarly, the “Roman plays” are unquestionably tragedies, not histories, with the possible exception of Antony and Cleopatra. However, the hybrid form of the “romances” or “tragicomedies” is more structural: the edges and degree are what dominate and place the romances squarely into comedies, even though the words are more like the tragedies (i.e., shorter).  So, the structure of the social network says "Comedy" but the length of the play says "Tragedy.”

## conclusion: extensibility ##

The networks thus provide a framework for discussion of the plays’ structure separately from their content. 37 plays is a small scale for this approach: future work will expand beyond a single author.

# paper (10min) #

## closing ##



The most exciting part about all of this, for me, is that the program ought to be able to run on any TEI-encoded play. I’m personally hoping to use it on a corpus I’m building of eighteenth century plays in English and French, but we would love to hear from scholars who have their own corpora of TEI-encoded plays which they’d like to explore as social networks.

# Works Cited #

## Works Referenced ##

https://www.sci.unich.it/~francesc/teaching/network/components.html

# Acknowledgements #
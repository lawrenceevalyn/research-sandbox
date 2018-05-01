Title: dh2018-shakespeare  
Author: Lawrence Evalyn

# final abstract (1200 wds) #

## Introduction ##

Our inquiry considers the speech interactions of characters within plays as a proxy for broad narrative structures. We analyze computationally-generated social networks of 37 plays by Shakespeare to see whether, and how, they can be used to distinguish between Shakespeare’s comedies, tragedies, and histories.

Because dramatic performances enact social encounters, social network analysis translates surprisingly well to fictional societies. Stiller et al. have shown that social networks in Shakespeare’s plays mirror those of real human interactions, particularly in size, clustering, and maximum degrees of separation (2003). However, as fictions, these networks are shaped not only by sociological principles, but also by narrative structures. Moretti uses social networks to examine the plots of three Shakespearean tragedies, and to contrast the structure of chapters in English and Chinese novels (2011). Alberich et al. (2002) and Sparavigna (2013) also discuss the interplay between social and narrative constraints on networks. We emphasize this distinction to look for specifically literary features of our networks.

Recent papers presented at DH2017 sought ways to richly quantify the details of one or two plays (Fischer et al. 2017, Tonra et al. 2017). At another scale, Algee-Hewitt examined 3,439 plays by looking only at the Gini Coefficient of each play’s eigenvector centrality (2017). With our three dozen plays, we attempt to strike a fruitful middle ground in the inevitable balancing act between detail and scale. Each play is considered individually, but at a level of abstraction which allows rapid and direct comparisons.

## Creation of Social Network Graphs ##


Although our parser has not solved the problem of guessing the specific addressees of a character’s speech, and instead tracks characters present on stage during speech, its simplifications allow it to be remarkably extensible. It could be used to parse any play that follows TEI P5 guidelines for performance texts. The parser uses the <role> and <who> tags to build a cast list for each play, and proceeds through the play using <div> tags to determine scene boundaries. Scenes are further subdivided into “blocks” based on character exits and entrances, to track who is on stage throughout the scene. If a character speaks or is mentioned in a stage direction (such as an entrance), and has not been named in an exit, they are assumed to be present on stage and able to hear all speech. Each speaking character is connected to all the characters present to hear their speech. These connections are recorded in a network graph, with characters as nodes and shared speech as edges. Edges are weighted based on the number of lines spoken.

To verify that our parser is accurate, we compare our generated network of Hamlet to Moretti’s well-known handmade model of that play (2011). Despite some minor differences in how we handle the most peripheral characters like “Servant”, and our less-minor difference in including the play-within-the-play, the two networks are highly similar. In both, Hamlet has the highest node centrality (the measure of connectedness which Moretti uses as a proxy for his status as protagonist) and highest node degree (the number of times he speaks or is spoken to), with Claudius, Gertrude, and Horatio similar but lagging behind. We concur with Moretti’s literary interpretation of these mathematical features.

Our tool improves on Moretti’s model by adding direction and weight to each connection. Although this level of detail turned out not to be necessary for the basic task of using network graphs to distinguish between Shakespeare’s genres, it may be useful in future work examining a less homogenous corpus of plays, or in work asking different questions about this corpus.

## Using Networks to Identify Genre ##

We then use our generated network graphs to test our central question: whether the social network enacted by a play’s characters can be used as a proxy for features of the play’s narrative content. More specifically, we ask whether social networks can be used to distinguish between the dramatic genres of tragedy, comedy, and history. Using a support vector machine with fivefold validation, we tested 17 different mathematical features of the networks. No single feature was independently sufficient to identify the genre, though graph density came closest (83% accuracy). However, if features are used in combination, the network graphs can indeed achieve full accuracy. One combination of features which does achieve 100% accuracy is edges, words, and degree. We are currently exploring other combinations that might also be capable of accurately identifying genres.

## Discussion ##

The potential utility of graph density in distinguishing genres is visually obvious when individual comedy and history networks are compared. Histories feature highly dispersed networks, with large numbers of very minor characters: messengers and vassals who are only spoken to and never speak back, or “First,” “Second,” and “Third” members of groups like soldiers and ambassadors, who each interject briefly in a single scene. 
in which paired connections form chains of acquaintance, but even the monarchs have low eigenvector centrality.
Graph density is insufficient, however, to account for the tragedies

Histories: a lot of useless people (We find histories more strongly distinguished from comedies and tragedies than comedies and tragedies are from each other, a distinction largely driven by the substantially higher numbers of peripheral characters in history plays. 
Figure: 2Henry6; Henry5

Comedies: small, dense network (Although comedies often have multiple subplots, these separate stories do not result in highly-separated networks. We theorize that comedic networks are strongly shaped by the plays’ final “resolution” scenes, which bring together the full cast. Relatedly, the average eigenvector centrality of the characters in comedies is much higher than in tragedies or histories; this suggests that many more of the characters in a comedy are “important,” reflecting a focus on ensemble stories.)
Figure: ComedyErrors; Midsummer

Tragedies: not, as expected, one “great talker”? But mostly the in between: something dense with some attendants; hard to identify directly, weird.
Figure: Othello; Lear; MacBeth; Hamlet

With this preliminary validation we can step back and look at Shakespeare’s various contested genres. The “Roman plays” are the simplest: they are unquestionably tragedies, not histories, with the possible exception of Antony and Cleopatra. 
Figure: Caesar; AntonyCleopatra; Coriolanus; Titus

We find that the three “problem plays” fall among the comedies for nearly every measure we consider. We don’t claim that this “solves” the question of genre for these plays, but rather propose it as support for literary arguments that the “problem” lies in a mismatch between a comedic structure and un-comedic subject matter.
Figure: AllsWell; Measure; TroilusCressida

The networks of the three “romances” are more structurally ambiguous, supporting literary arguments that Shakespeare’s writing had grown more experimental at the end of his career. The edges and degree are what dominate and place the romances squarely into comedies, even though the words are more like the tragedies (i.e., shorter).  So, the structure of the social network says "Comedy" but the length of the play says "Tragedy.” 
Figure: Pericles; Cymbeline; Winters; Tempest

## conclusion: extensibility ##

# Conclusions

[The metrics that Algee-Hewitt sees as changing broadly with historical time here correlate with a particular type of play. If eigenvector centrality goes down over time, that may reflect a reduction in history and tragedy in favour of comedy.]

The networks thus provide a framework for discussion of the plays’ structure separately from their content. 37 plays is a small scale for this approach: future work will expand beyond a single author.

Our parser successfully and rapidly produces sophisticated social network graphs of marked up plays. We have used these networks as a supplement to close-reading Shakespeare’s oeuvre, and as a tool to explore complex relationships between Early Modern theatrical genres.

Our first 37 networks are available online in an interactive format to allow others to pose their own questions for future work on Shakespeare’s networks.

However, since the parser is highly extensible and can be used with any plays available in TEI encoding, future work need not be restricted to the Early Modern period. It need not even be restricted to works written in English. We are implementing features to translate between different XML tag sets to further extend its applicability.

Narrative structures and the social position of characters within their fictional worlds can both be difficult to concretely articulate and compare. Our networks of the well-studied works of Shakespeare can provide a baseline against which to contextualize analysis of these elements in works for which there is far less critical consensus.

To enable other scholars to explore these networks in more detail, visualizations and selected quantitative properties for each play’s network are available in an interactive tool online.

# Works Cited #

## Works Referenced ##

https://www.sci.unich.it/~francesc/teaching/network/components.html

# Acknowledgements #
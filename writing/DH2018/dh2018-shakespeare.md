Title: dh2018-shakespeare  
Author: Lawrence Evalyn

# final abstract (1200 wds) #

## Introduction ##

Our inquiry considers the speech interactions of characters within plays as a proxy for broad narrative structures. We analyze computationally-generated social networks of 37 plays by Shakespeare to see whether, and how, they can be used to distinguish between Shakespeare’s comedies, tragedies, and histories.

Because dramatic performances enact social encounters, social network analysis translates surprisingly well to fictional societies. Stiller et al. have shown that social networks in Shakespeare’s plays mirror those of real human interactions, particularly in size, clustering, and maximum degrees of separation (2003). However, as fictions, these networks are shaped not only by sociological principles, but also by narrative structures. Moretti uses social networks to examine the plots of three Shakespearean tragedies, and to contrast the structure of chapters in English and Chinese novels (2011). Alberich et al. (2002) and Sparavigna (2013) also discuss the interplay between social and narrative constraints on networks. We emphasize this distinction to look for specifically literary features of our networks.

Recent papers presented at DH2017 sought ways to richly quantify the details of one or two plays (Fischer et al. 2017, Tonra et al. 2017). At another scale, Algee-Hewitt examined 3,439 plays by looking only at the Gini Coefficient of each play’s eigenvector centrality (2017). With our three dozen plays, we attempt to strike a fruitful middle ground in the inevitable balancing act between detail and scale. Each play is considered individually, but at a level of abstraction which allows rapid and direct comparisons.

## Creation of Social Network Graphs ##

Although our parser has not solved the problem of guessing the specific addressees of a character’s speech, and instead tracks characters present on stage during speech, its simplifications allow it to be remarkably extensible. It could be used to parse any play that follows TEI P5 guidelines for performance texts. Each speaking character is connected to all characters currently present on stage. These connections are recorded in a network graph, with characters as nodes and shared speech as edges. Edges are directional, and weighted based on the number of lines spoken.

To verify that our parser is accurate, we compare our generated network of Hamlet to Moretti’s well-known handmade model of that play (2011). Despite some minor differences in peripheral characters like “Servant”, and our less-minor difference in including the play-within-the-play, the two networks are highly similar. Our network graph supports Moretti’s reading. Our tool also improves on Moretti’s model by adding direction and weight to each connection. Although this level of detail turned out not to be necessary for the basic task of using network graphs to distinguish between Shakespeare’s genres, it may be useful in future work examining a less homogenous corpus of plays, or in work asking different questions about this corpus.

## Using Networks to Identify Genre ##

We then use our generated network graphs to test our central question: whether the social network enacted by a play’s characters can be used as a proxy for features of the play’s narrative content. More specifically, we ask whether social networks can be used to distinguish between the dramatic genres of tragedy, comedy, and history. Using a support vector machine with fivefold validation, we tested 17 different mathematical features of the networks. No single feature was independently sufficient to identify the genre, though graph density came closest (83% accuracy). However, if features are used in combination, the network graphs can indeed achieve full accuracy. One combination of features which does achieve 100% accuracy is edges, words, and degree. We are currently exploring other combinations that might also be capable of accurately identifying genres.

## Discussion ##

### History, Comedy, Tragedy ###

The potential utility of graph density in distinguishing genres is visually obvious when individual comedy and history networks are compared. Histories feature highly dispersed networks, with large numbers of very minor characters, such as “First,” “Second,” and “Third” members of groups like soldiers and ambassadors, who each interject briefly in a single scene. Connections form chains of acquaintance with little overlap, so even the monarchs have low eigenvector centrality.
Figure: 2Henry6; Henry5

Comedies, in contrast, feature networks with far fewer characters, in which nearly everybody speaks to nearly everybody else at some point. Although comedies often have multiple subplots, these separate stories do not result in highly-separated networks. We theorize that comedic networks are strongly shaped by the plays’ final “resolution” scenes, which bring together the full cast. The average eigenvector centrality of the characters in comedies is much higher than in tragedies or histories; this suggests that many more of the characters in a comedy are “important,” reflecting a focus on ensemble stories.
Figure: ComedyErrors; Midsummer
 
Graph density is insufficient, however, to fully distinguish the tragedies, which feature networks somewhere between history and comedy in their density. They often have a dense core with a secondary ring of more peripheral characters. What seems to distinguish them is the existence of the central tragic hero, whose influence directly touches more of the network than the protagonists of histories, but whose connections are less interconnected than the ensembles of comedies. These subtleties are better captured, it seems, by the combined metric of “edges, degree, and words.”
Figure: Othello; Lear; MacBeth; Hamlet

### The "Problem Plays" ###

We then use our preliminary identification of each genre’s features to examine Shakespeare’s various contested genres. Training our model only on the plays for which there is strong consensus, we applied it to the “Roman plays,” the “problem plays,” and the “romances” in turn. Of the Roman plays, all but Antony and Cleopatra are identified as tragedies by every metric; Antony and Cleopatra is identified as a history by “edges, words, and degree” and as a comedy by “degree, modularity, and density”. Of the problem plays, All’s Well that Ends Well is always identified as a comedy; Troilus and Cressida and Measure for Measure are both identified as a comedy by all metrics except for “edges, criticality, and degree”, which identify them as tragedies. The three romances, despite visually unusual networks which support literary arguments that Shakespeare’s writing had grown more experimental at the end of his career, are identified as comedies by every mathematical metric. We treat none of these identifications as definitive declaration of the plays’ “real” genres, but use them to distinguish between plays whose generic ambiguity lies in their subject matter, and plays whose ambiguity lies in their structure.
Figure: Caesar; AntonyCleopatra; Coriolanus; Titus
Figure: AllsWell; Measure; TroilusCressida
Figure: Pericles; Cymbeline; Winters; Tempest

## Conclusion ##

Our parser successfully and rapidly produces sophisticated social network graphs of TEI plays, which can be used to computationally identify theatrical genre in Shakespeare’s plays. Thirty-seven plays is a small scale for this approach: since the parser is highly extensible and can be used with any plays encoded in TEI, future work need not be restricted to the Early Modern period. It need not even be restricted to works written in English. Our networks of the well-studied works of Shakespeare can provide a baseline against which to contextualize analysis of these elements in works for which there is far less critical consensus.

# Works Cited #

## Works Referenced ##

https://www.sci.unich.it/~francesc/teaching/network/components.html

# Acknowledgements #
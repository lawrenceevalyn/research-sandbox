Title: problem-plays  
Author: Lawrence Evalyn

# Thesis #

# Lit review #

## SNA good for plays ##

Because dramatic performances enact social encounters, social network analysis translates surprisingly well to fictional societies. Stiller et al. have shown that social networks in Shakespeare's plays mirror those of real human interactions, particularly in size, clustering, and maximum degrees of separation (2003). However, as fictions, these networks are shaped not only by sociological principles, but also by narrative structures. Moretti uses social networks to examine the plots of three Shakespearean tragedies, and to contrast the structure of chapters in English and Chinese novels (2011). Alberich et al. (2002) and Sparavigna (2013) also discuss the interplay between social and narrative constraints on networks. We emphasize this distinction to look for specifically literary features of our networks.
Recent papers presented at DH2017 sought ways to richly quantify the details of one or two plays (Fischer et al. 2017, Tonra et al. 2017). At another scale, Algee-Hewitt examined 3,439 plays by looking only at the Gini Coefficient of each play's eigenvector centrality (2017). With our three dozen plays, we attempt to strike a fruitful middle ground in the inevitable balancing act between detail and scale. Each play is considered individually, but at a level of abstraction which allows rapid and direct comparisons.

# Methods #

## parser ##

Although our parser has not solved the problem of guessing the specific addressees of a character's speech, and instead tracks characters present on stage during speech, its simplifications allow it to be remarkably extensible. It could be used to parse any play that follows TEI P5 guidelines for performance texts. Each speaking character is connected to all characters currently present on stage. These connections are recorded in a network graph, with characters as nodes and shared speech as edges. Edges are directional, and weighted based on the number of lines spoken.
To verify that our parser is accurate, we compare our generated network of Hamlet to Moretti's well-known handmade model of that play (2011). Despite some minor differences in peripheral characters like "Servant", and our less-minor difference in including the play-within-the-play, the two networks are highly similar. Our network graph supports Moretti's reading. Our tool also improves on Moretti's model by adding direction and weight to each connection. Although this level of detail turned out not to be necessary for the basic task of using network graphs to distinguish between Shakespeare's genres, it may be useful in future work examining a less homogenous corpus of plays, or in work asking different questions about this corpus.

## THINGS TO MAKE TRUE ##

1. We used a reputable TEI encoding of the First Folio plays.
2. Each play was assigned the genre given to it in the First Folio.

THEN I can describe what metrics (if any) can distinguish genres, and what genres they gave to the Roman plays / problem plays / romances.

# Findings #

## Regular plays ##

## "Problem plays ##

# Conclusion #

# Works Cited #
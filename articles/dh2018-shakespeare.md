Title: dh2018-shakespeare  
Author: Lawrence Evalyn

# final abstract (1200 wds) #

## intro & context ##

## shakey's social networks ##

### methods ###

### findings ###

## summary & future work ##

# abstract (1000 wds) #

## brief summary ##

Our inquiry considers the speech interactions of characters within plays as a proxy for narrative structure. We generated social networks from XML marked up editions of all of Shakespeare’s plays. The networks capture character speech as a directional connection between the speaker and all characters present to hear their speech, weighted by the number of words spoken. We explore correlations between the mathematical properties of the networks and dramatic genre. We have also made these networks available and manipulable online. These networks may be of interest to scholars of Shakespeare, and allow another approach to discussions of generic hybridity in early modern drama. The project as a whole may also provide a way to make comparisons within large corpora of plays.

## intro & context ##

Our inquiry considers the speech interactions of characters within plays as a proxy for broad narrative structures. We analyze computationally-generated social networks of 37 plays by Shakespeare to explore metrics for nuanced comparison within large corpora of comparable plays.

Because dramatic performances enact social encounters, social network analysis translates surprisingly well to fictional societies. Stiller et al. have shown that social networks in Shakespeare’s play mirror those of real human interactions, particularly in size, clustering, and maximum degrees of separation (2003). These similarities lend validity to discussions of individual characters filling specific roles in their social networks, particularly in terms of connectedness and cliques.

However, as fictions, these networks are shaped not only by sociological principles, but also by narrative structures. Moretti uses social networks to examine the plots of three Shakespearean tragedies, and to contrast the structure of chapters in English and Chinese novels (2011). Alberich et al. (2002) and Sparavigna (2013) also discuss the interplay between social and narrative constraints on networks. We emphasize this distinction to look for specifically literary features of our networks.

Recent papers presented at DH2017 sought ways to richly quantify the details of one or two plays (Fischer et al. 2017, Tonra et al. 2017). At another scale, Algee-Hewitt examined 3,439 plays by looking only at the Gini Coefficient of each play’s eigenvector centrality (2017). With our three dozen plays, we attempt to strike a fruitful middle ground in the inevitable balancing act between detail and scale. Each play is considered individually, but at a level of abstraction which allows rapid and direct comparisons.


## shakey's social networks ##

### methods ###

We generated social networks from XML files of Shakespeare’s 37 plays, with characters as nodes and directional speech as edges. Previous scholars’ work regularizing character names through TEI markup allows the parser to use the tagged character names and stage directions to track who is present on stage as each scene proceeds. This fine-grained approach breaks each scene into many smaller ‘blocks’ based on the configuration of characters on stage, reducing false positives caused by characters who appear in the same scene but at different times. Each speaking character is connected to all the characters present to hear their speech, weighted by the number of words spoken.

The resulting 37 networks are visualized and analyzed in Gephi. Visualizations and selected quantitative properties for each play’s network are available online in an interactive tool, to allow additional exploration beyond our study.

### findings ###

To verify that our tool is accurate, we compare our generated network of Hamlet to Moretti’s well-known handmade model of that play (2011). Despite some minor differences in how we handle the most peripheral characters like “Servant”, the two networks are highly similar. In both, Hamlet has the highest node centrality (the measure of connectedness which Moretti uses as a proxy for his status as protagonist) and highest node degree (the number of times he speaks or is spoken to), with Claudius, Gertrude, and Horatio similar but lagging behind. We concur with Moretti’s literary interpretation of these mathematical features.

Our tool improves on Moretti’s model by adding direction and weight to each connection. It becomes possible to identify characters with strongly varying in-degree and out-degree measures (either speaking to others substantially more than they are spoken to, or the reverse), which we explore as a metric of the character’s social rank. These added details reinforce Moretti’s literary arguments about Shakespearean tragedy, but also enable a more nuanced comparison between Hamlet and other plays.

Using a computational parser also allows us to easily expand our comparisons to the rest of Shakespeare’s oeuvre, including more minor works. We discuss the literary implications of the social networks of some of Shakespeare’s less-studied plays, such as Antony & Cleopatra.

In addition to close-reading the network visualizations of individual plays, we compare the mathematical properties of plays grouped by genre. Beginning with groupings of tragedies, comedies, and histories for which there is a strong consensus in classification, we consider categories for Shakespeare’s ambiguous or hybrid plays. We pay particular attention to tragedy, examining whether tragedies present particular social structures ripe for social breakdown. We explore the extent to which metrics such as longest path, average connectivity, and clustering can serve as proxies for dramatic narrative structures. 

## summary & future work ##

Our parser successfully and rapidly produces sophisticated social network graphs of marked up plays. We have used these networks as a supplement to close-reading Shakespeare’s oeuvre, and as a tool to explore complex relationships between Early Modern theatrical genres.

Our first 37 networks are available online in an interactive format to allow others to pose their own questions for future work on Shakespeare’s networks.

However, since the parser is highly extensible and can be used with any plays available in TEI encoding, future work need not be restricted to the Early Modern period. It need not even be restricted to works written in English. We are implementing features to translate between different XML tag sets to further extend its applicability.

Narrative structures and the social position of characters within their fictional worlds can both be difficult to concretely articulate and compare. Our networks of the well-studied works of Shakespeare can provide a baseline against which to contextualize analysis of these elements in works for which there is far less critical consensus.

# response to reviewers #


To briefly address questions about the parser: although our parser has not solved the problem of guessing the specific addressees of a character’s speech, and instead tracks characters present on stage during speech, its simplifications allow it to be remarkably extensible. It could be used to parse any play that follows TEI P5 guidelines for performance texts, using <speaker> tags with standardized character names and marking act and scene divisions with <div> tags. The parser also examines scene descriptions to see if there are characters present who do not speak, but would function reasonably robustly if scene descriptions were absent. We intend to use the parser on a body of eighteenth century plays for the next phase of the project, demonstrating its versatility.

The majority of reviewers requested more detail on our literary arguments. Our assessment is likely to be further refined as we return to the literary criticism on the topic, but we have found several metrics useful for identifying comedies and histories. Interestingly, the networks of tragedies seem to represent a middle ground between histories and comedies, and are difficult to discuss directly.

We find histories more strongly distinguished from comedies and tragedies than comedies and tragedies are from each other, a distinction largely driven by the substantially higher numbers of peripheral characters in history plays. Histories also feature highly dispersed networks (high criticality, modularity, and eccentricity, and low betweenness centrality) in which paired connections form chains of acquaintance, but even the monarchs have low eigenvector centrality. We use these metrics, particularly as they apply to Antony and Cleopatra, to consider classing the “Roman plays” with the histories, but ultimately affirm their placement with tragedies.

Comedies, in contrast, are distinguished by densely interconnected networks. Although comedies often have multiple subplots, these separate stories do not result in highly-separated networks. We theorize that comedic networks are strongly shaped by the plays’ final “resolution” scenes, which bring together the full cast, and contrast these with the rhythms of character entrances and exits in tragic endings. Relatedly, the average eigenvector centrality of the characters in comedies is much higher than in tragedies or histories; this suggests that many more of the characters in a comedy are “important,” reflecting a focus on ensemble stories.

The observations above exclude Shakespeare’s “problem plays” and “romances”. We find that the three “problem plays” fall among the comedies for nearly every measure we consider. We don’t claim that this “solves” the question of genre for these plays, but rather propose it as support for literary arguments that the “problem” lies in a mismatch between a comedic structure and un-comedic subject matter. The networks of the three “romances” are more structurally ambiguous, supporting literary arguments that Shakespeare’s writing had grown more experimental at the end of his career.

We look forward to presenting the graphs of all 37 plays (which unfortunately cannot be attached to this response) to show visually the mathematical differences we have observed.

# paper #

## speech as proxy for narrative structure ##

Our inquiry considers the speech interactions of characters within plays as a proxy for narrative structure.
Because dramatic performances enact social encounters, social network analysis translates surprisingly well to fictional societies. Stiller et al. have shown that social networks in Shakespeare’s play mirror those of real human interactions, particularly in size, clustering, and maximum degrees of seperation (2003). These similarities lend validity to discussions of individual characters filling specific roles in their social networks, particularly in terms of connectedness and cliques.

However, as fictions, these networks are shaped not only by sociological principles, but also by narrative structures. Moretti uses social networks to examine the plots of three Shakespearean tragedies, and to contrast the structure of chapters in English and Chinese novels (2011). Alberich et al. (2002) and Sparavigna (2013) also discuss the interplay between social and narrative constraints on networks. We emphasize this distinction to look for specifically literary features of our networks.

## social networks from XML ##

We generated social networks from XML marked up editions of all of Shakespeare’s plays. The networks capture character speech as a directional connection between the speaker and all characters present to hear their speech, weighted by the number of words spoken.
We generated social networks from XML files of Shakespeare’s 37 plays, with characters as nodes and directional speech as edges. Previous scholars’ work regularizing character names through TEI markup allows the parser to use the tagged character names and stage directions to track who is present on stage as each scene proceeds. This fine-grained approach breaks each scene into many smaller ‘blocks’ based on the configuration of characters on stage, reducing false positives caused by characters who appear in the same scene but at different times. Each speaking character is connected to all the characters present to hear their speech, weighted by the number of words spoken.

The resulting 37 networks are visualized and analyzed in Gephi. Visualizations and selected quantitative properties for each play’s network are available online in an interactive tool, to allow additional exploration beyond our study.

### verified against Moretti ###

To verify that our tool is accurate, we compare our generated network of Hamlet to Moretti’s well-known handmade model of that play (2011). Despite some minor differences in how we handle the most peripheral characters like “Servant”, the two networks are highly similar. In both, Hamlet has the highest node centrality (the measure of connectedness which Moretti uses as a proxy for his status as protagonist) and highest node degree (the number of times he speaks or is spoken to), with Claudius, Gertrude, and Horatio similar but lagging behind. We concur with Moretti’s literary interpretation of these mathematical features.

## interpretation ##

We explore correlations between the mathematical properties of the networks and dramatic genre.

Our tool improves on Moretti’s model by adding direction and weight to each connection. It becomes possible to identify characters with strongly varying in-degree and out-degree measures (either speaking to others substantially more than they are spoken to, or the reverse), which we explore as a metric of the character’s social rank. These added details reinforce Moretti’s literary arguments about Shakespearean tragedy, but also enable a more nuanced comparison between Hamlet and other plays.

Using a computational parser also allows us to easily expand our comparisons to the rest of Shakespeare’s oeuvre, including more minor works. We discuss the literary implications of the social networks of some of Shakespeare’s less-studied plays, such as Antony & Cleopatra.

In addition to close-reading the network visualizations of individual plays, we compare the mathematical properties of plays grouped by genre. Beginning with groupings of tragedies, comedies, and histories for which there is a strong consensus in classification, we consider categories for Shakespeare’s ambiguous or hybrid plays. We pay particular attention to tragedy, examining whether tragedies present particular social structures ripe for social breakdown. We explore the extent to which metrics such as longest path, average connectivity, and clustering can serve as proxies for dramatic narrative structures.

## future work ##

We have also made these networks available and manipulable online. These networks may be of interest to scholars of Shakespeare, and allow another approach to discussions of generic hybridity in early modern drama. The project as a whole may also provide a way to make comparisons within large corpora of plays.

Our first 37 networks are available online in an interactive format to allow others to pose their own questions for future work on Shakespeare’s networks.

However, since the parser is highly extensible and can be used with any plays available in TEI encoding, future work need not be restricted to the Early Modern period. It need not even be restricted to works written in English. We are implementing features to translate between different XML tag sets to further extend its applicability.

Narrative structures and the social position of characters within their fictional worlds can both be difficult to concretely articulate and compare. Our networks of the well-studied works of Shakespeare can provide a baseline against which to contextualize analysis of these elements in works for which there is far less critical consensus.

# Works Cited #

## Works Referenced ##

https://www.sci.unich.it/~francesc/teaching/network/components.html

# writing timeline #


March 5 - find out whether we’re accepted to DH2018
March 31 - finalize Shakespeare networks. Start exploring other networks?
April 30 - first draft of paper?
May 31 - second draft of paper?
June 26 - DH2018
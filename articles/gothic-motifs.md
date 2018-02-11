Title: gothic-motifs
Author: Lawrence Evalyn

# Abstract #

This paper examines more than five hundred pre-Victorian Gothic works to ask whether female writers created categorically different works than their male peers. Two qualitative bibliographies of the Gothic provide “motifs” and “Gothic types” for computational modelling. In these models, many of the literary features which have been attributed to the ‘Female Gothic’ or to the ‘school of Radcliffe’ are, in fact, particular to Ann Radcliffe herself. Radcliffe thus stands in contrast to Matthew Lewis, whose horror-based ‘school of Lewis’ does constitute a gendered men’s Gothic.
——
Does my article has problems with focus?
- probably; worried it's too narrow... need to pick the broadest argument, and (respectfully) establish / recapitulate the Gothic discourse

Need to cite 10 to 20 sources at least **

use discipline-related expertise: try to put in some close reading?

I don't think I'm too defensive; probably the opposite

surface the structure
subordinate the concrete
don't let the data organize the argument - "usually this is because the data is more real to you than your analysis of it"

instant thesis maker: Although ___, nevertheless ___ because ___.

# title #

Computationally Distant-Reading Bibliographical Thin Descriptions In Search Of A Women’s Gothic; Or, I Have Approximate Knowledge of Many Things

# introduction #

## women's gothic, not female gothic ##

By turning to the late eighteenth-century Gothic, and particularly the troublesome category of “the female Gothic”, I examine a mass of books that have been vaguely disreputable since they were first published.[ I could add these bits for flavour but I don’t think they’re necessary:

[(cite Garside on publishers’ exasperation)] [Nowadays “Almost all of these novels have long since been deservedly forgotten.” (CITE review of Garside)], [though we still care about some]] At its inception and for most of its literary history, criticism of Gothic emotional excess or implausible machinery generally went hand-in-hand with dismissals of the genre as unserious due to its perceived alignment with women. In the 1980s, feminist critics like Juliann Fleenor enabled the “Female Gothic”, defined as Gothic works “written and consistently read by women”,[^cf1] to stand as a worthy object of study regardless of the individual works’ literary qualities due to their direct relationships to a patriarchal paradigm and their ability “to express the conflict for which patriarchy has no name”.[^cf2] Contemporary critics have turned their attention from relationships between women and their world to relationships between texts. This shift is exemplified in Robert Miles’s sophisticated reading of Ann Radcliffe and Matthew Lewis’s works as making use of both “Female Gothic” and “Male Gothic” “narrative grammar”.[^cf3] Any number of definitions for male and female Gothics are available. [Robert Miles’ definition of male/female gothics here.] David Richter provides definitions based on plot structures: “The ‘female Gothic’ is … a melodrama arousing sympathy and suspense through the unwarranted persecution of an innocent. The ‘male Gothic’ is a punitive tragedy…in which we are made both to desire and to expect the condign punishment of the central figure.”[^cf4] Even Barbara Benedict’s “‘Male’ and ‘Female’ Novels?”, which questions the premise of gender division in its title, refers with assurance to “the subgenre of the female Gothic, which emphasized the uncertainties of perception that heroines suffer in an obscure, dangerous, patriarchal world”.[^cf5] My interest is in something less fine-grained: not the exemplary literary aesthetic of a Female Gothic, but the popular phenomenon of a women’s Gothic. Over the course of three literary experiments, in which I model the early Gothic novel by means of bibliographic data, I ask whether the hundreds of women writing Gothic novels wrote observably different books than the hundreds of men doing the same. In doing so, I find that men’s and women’s schools do indeed exist, but that they do not map neatly to a set of female/male terror/horror Radcliffe/Lewis binaries, and that both gendered schools are dwarfed by a non-gendered Gothic mainstream. 

## theory: my bibs have thin description ##

My theoretical approach emphasizes the continuities between computational approaches to literature and the the venerable tradition of archival bibliographical research. Heather Love has notably turned to sociological microanalysis as a model for 'thin description' close-but-not-deep reading methods; I employ qualitative computational modelling as another method which seeks the same goals. Love emphasizes thin description as not just “fine-grained” but “exhaustive” (and possibly exhausting)[^cf6] but with the reward that “one could—at least ideally—pay equal attention to every aspect … and record it faithfully.”[^cf7]  I add to this that good descriptions offer themselves up for reuse and recombination, by rendering somehow graspable that which they describe. Downplaying the importance of close interpretation, Love says that “Good descriptions … account for the real variety that is already there.”[^cf8] It is the work of accounting for real variety that both bibliography and computation demand: the system must have a way to cope with odd cases. Even if one simply makes an exception to otherwise-established rules, or adds an expanatory footnote or a comment within one’s code, outliers must be acknowledged and grappled with. I use computational interventions to interrogate the literary models represented in two older bibliographies. In so doing, I argue, I demonstrate the utility of qualitative description, as a promising avenue toward revisiting older scholarships and re-forging connections with the work that has come before.

## bibliographies ##

Having declared an interest in eighteenth century novels and bibliographic research, Peter Garside and James Raven’s monumental The English Novel, 1770–1829 immediately demands consideration. Lee Erickson aptly called it “magnificent” for its scope[^cf9]. But is is Garside’s scope which works against this project; instead, I will use two earlier bibliographies, by Ann Tracy and Frederick Frank, which are more partial, qualitative, and idiosyncratic — features which may not recommend a bibliography as a general reference, but which make them rich subjects for modelling. Both works’ basic bibliographical data is duplicated in Garside,[^cf10] but both also offer substantial qualitative descriptions of the works they list, including summaries of their contents. Ann Tracy indexes 208 works from the years 1753-1857,[^cf11] of which 103 are by female authors, 95 by male, and only 10 unknown. Frederick Frank indexes 499 works published in the years 1753 to 1835 (with one outlier by Beckford not published until 1912). 215 of Frank’s authors are female, 156 male, and 128 unknown. Because each bibliographer excludes some works which are included by the other, they provide information about 529 unique texts, but only 178 works are indexed in both bibliographies.  Both show substantially higher counts of female authorship, and lower counts of anonymous authorship, than were typical of novels as a whole[^cf12]. This over-representation of women might be selection bias, or it might reflect some underlying reality to the period’s assumption that women wrote Gothics; this paper won’t answer that question, but will instead statistically normalize raw book counts.

## I'm modelling here ##

Although I will use a number of graphs to make my argument, the key term for my methodological approach is not “data visualization,” but “modelling.” Johanna Drucker has given compelling warnings about the dangers of treating constructed information as empirically objective “data” which may then be passively “visualized”.[^cf13] Willard McCarty’s discussion of models as both “pragmatic” and “fictive” is more accurate to the scholarly process of gathering, classifying, correlating, and interpreting information.[^cf14] Whether a model is a reading or a bar chart, the worth of that model must be judged by its “fruitfulness”[^cf15], a term for which Stephen Ramsay provides a useful definition:  “the robustness of the discussion that a particular procedure annunciates”[^cf16]. In other words, whether or not the model has revealed what we expected to see, it has revealed something with which we must now engage. Exact corerspondence is thus less of a “fundamental principle”[^cf17], and more of an imagined destination which spurs valuable journeys. This flexibility allows us to cope with the fact that as a model is constructed, it becomes sensitive to some areas of difference while eliding others. No model needs to be accurate in all points, so long as it is sensitive to the desired area of differences. It is also worth noting that not all models are computational, as is evidenced by the meticulous historical research of Leah Price, whose monograph The Anthology and the Rise of the Novel argues that any edited text — ‘elaborate’ or not — produces, not a flawed or distorted copy of the original, but a new text.[^cf18] As Price observes, when scholars examine texts — when we take notes on them, extract quotes for close reading, summarize of categorize scenes, chapters of books — our act of reading is also one of editing. McCarty allows us to recognize that this mental editing is not a sign of scholarly weakness, but a model, made necessary by the limits of human memory.

## Frank and Tracy are models ##

My two ‘texts’ — bibliographies by Ann Tracy and Frederick Frank — are thus themselves models of “The Gothic Novel.” Because, as Price observes, the process of editing a text must always reveal the editor’s “unspoken assumptions about the most efficient way to convey information, and indeed what counts as information at all,”[^cf19] the editorial processes behind each bibliography makes each one sensitive to very different concerns.[^cf20] Ann Tracy’s The Gothic Novel 1790-1830: Plot Summaries and Index to Motifs emphazises dramatic events and singular images, with recurring details systematically tallied in the index. In contrast, Frederick Frank’s The First Gothics: A Critical Guide to the English Gothic Novel emphasizes each work’s overall tone and provides qualitative and subtle evaluations of its critical reception. Although only 178 works are shared between the two, they usefully complement each other in the search for gendered Gothic writing traditions. The process of computationally re-rendering each bibliography amplifies each bibliographer’s choices, allowing me to see whether their distinctions are fruitful, and whether their models point toward distinct men’s and women’s Gothics.

# Ann Tracy #

## Tracy values uniqueness ##

Tracy’s bibliography is built to be more like a particularly helpful finding aid than a comprehensive check-list.  Her most unusual qualitative bibliographical work is her ten-page “Index to Motifs” identifying the books in which 208 different “motifs” appear. Tracy uses the term “motif” broadly to encompass a wide range of plot elements, images, and character types. The index is intended for “scholars with particular interests”[^cf21], who wish to locate and read books containing individual story elements, such as “doppelganger” or “garden as scene of temptation”. Accordingly, Tracy prioritizes presenting a wide range of highly distinctive motifs rather than those that constitute the norm. Indeed, she intentionally excluded the most popular motifs: “the abundance of murders,” she says, “argued for the retention… of specialized murders only,”[^cf22] and castles have similarly been ingored. In addition to the motifs, Tracy provides a plot summary of each novel. Her summaries, too, emphasize distinctive details, pointing out things like “a particularly interesting Satan, with molten insides”.[^cf23] As a model of the Gothic, Tracy’s bibliography elides continuities to increase its sensitivity to points of difference. It treats each novel as a collection of discrete elements, only one of which is likely to be of interest to a given scholar. The motifs themselves — Satans, murders, doppelgangers, gardens — are thus constructed as the stable objects of study, which must be examined through the filter of individual novels.

## my model of Tracy ##

I take Tracy’s model to its logical extension by foregrounding her motifs. I distilled her index of 208 motifs into 92 charts of motifs which appear in at least 20 works.[^cf24] Using her model to investigate the possibility of a women’s Gothic, I examine the potential predictive power of each motif. I ask whether the presence of any given motif in a work constitutes meaningful information regarding the probable gender of that work’s author. A series of procedural design choices emphasizes the qualitative interpretation inherent in my framing of this question.[^cf25] An identifiable gendered school immediately emerges: 38 distinctly male-authored motifs[^cf26] indicate a men’s Gothic defined by largely the things we would expect men to dominate.

## men's Gothic ##

Comparing these male-dominated motifs to the neutral or female-dominated motifs involves constant escalation. Women may write about libertines (64% female), whose seductions may be coercive and almost always end poorly for their victims, but men write about the act of rape itself (75% male). Tracy’s motifs suggest that the darkest side of the Gothic was primarily the province of men: death is female-dominated when it is sad or pious (61% female), but murder is male-dominated (64% male), as are blood (68% male), corpses (70% male), and skeletons and skulls (73% male). When male authors write about death, then, it seems that they dwell not on its emotional impact, but on its more vivid physical results. Similarly, human sacrifice (64% male), starvation (67% male), torture (67% male), and putrefaction (74% male), all involve directly depicting that which other novels might merely imply. The masculine impulse to “go farther,” to replace coy allusions with unflinching enactments, is most evident in these novels’ treatment of incest. General themes of incest are widespread, appearing in 51 of the 208 novels under consideration — nearly a quarter of the works. However, in 45 of those novels, there are no cases of what Tracy terms “actual” incest, only “incest, literary flirtation with (including false alarms, foiled attempts, threats, and unconsummated incestuous passion).” The narrative discretion behind a literary fliration with incest is employed roughly equally by both male and female authors (54% male / 46% female), and makes up the vast majority of all depictions of incest. However, six cases of actual, no-narrative-flinching incest are documented— and all six are by men. To force one’s readers to look directly at the horrors depicted, rather than allowing them to become terrified by their own imaginations, is, of course, the technique of the horror Gothic, as contrasted with the terror Gothic. Identifying the horror Gothic as a predominantly male affair comes as no surprise, and accords nicely with the critical tradition of identifying Matthew Lewis as the quintessential horror Gothic writer. Together, these motifs point to a distinct men’s Gothic in the Lewisian horror tradition.

## subterranean passages ##

In contrast to this abundance of male-dominated tropes, female-authored tropes are elusive. The Radcliffean plot elements of subterranean passages (61% male), caves (61% male), and secret doors (59% male) turn out to be firmly correlated with male authors, not female. This is not to say that these motifs are not Radcliffean: Radcliffe alone accounts for 7% of all caves, 11% of all secret doors, and an astonishing 15% of all subterannean passages. Indeed, she is the top author for both subterranean passages and secret doors. But beyond Radcliffe, these tropes have been disproportionately adopted by men, not women. The critical emphasis on subterranean passages and caves as crucial Gothic tropes can likely be explained by who makes the “top 10” lists of their use:
Subterranenan Passages
Radcliffe, Ann
6
Ireland, William Henry
3
Curties, T. J. Horsley
3
unsigned
2
Sleath, Eleanor
2
Maturin, Charles Robert
2
Lewis, Matthew
2
Yorke, Mrs. R. M. P.
1
Wilkinson, Sarah
1
Walpole, Horace
1


Caves
Lewis, Matthew
4
Roche, Regina Maria
3
Radcliffe, Ann
3
unsigned
2
Maturin, Charles Robert
2
Ireland, William Henry
2
Green, William Child
2
Curties, T. J. Horsley
2
Wilkinson, Sarah
1
Walpole, Horace
1

Although neither motif appears widely throughout the Gothic, they repeat within the works of all four authors typically taken as the landmark writers of the genre: Walpole for the Gothic’s birth, Radcliffe and Lewis for its flourishing, and Maturin for its end. Anything prominently used by all four is surely ripe for closely-read comparison. But those comparisons illuminate more about the individual authors than the Gothic’s general usage; and, in the case of subterranean passages, they tell us more about Radcliffe than they do a women’s Gothic.

## women's Gothic ##

Instead, in this model of the genre, the women’s Gothic seems to be defined by only four things: libertines (64% female), forced weddings (62% female), sad or pious deaths (61% female), and miniature portraits (61% female). The libertines and miniature portraits in particular, as the most common female motifs, immediately suggest a women’s Gothic that is in striking conversation with novels like Jane Austen’s, whose ordered and rational novels are nonetheless repelete with rakes and miniatures. Or, looking at their prominence in the top ten for each of these tropes, one might be tempted to investigate Regina Maria Roche and Louisa Sidney Stanhope as the unexpected representatives of the women’s Gothic. However, narrow margin of [dominance] for each motif suggests that defining a genre here may be too hasty. The male motifs represented a variety of elements used by many different men, such that no one author could be responsible for its gendered uptake. These female motifs are far less robust: if we ignore either Roche or Stanhope, we are down to just two female-dominated motifs, and if we ignore both, we are left with zero. When it comes to the inclusion of particular story elements, then, this women’s Gothic is outnumbered not just by the men’s Gothic but also by the mainstream Gothic.

## mainstream Gothic ##

More than half of the motifs under consideration are not strongly gendered in either direction. Four are even perfect ties: elopement (all subcategories); dueling and other single combat; fainting, female; and rediscovery of lost relatives. Moreover, the more popular a motif is — that is, the larger a role it plays in constituting the default expectations of the genre — the more likely it is to be non-gendered. Indeed, all of the strongly male-dominated motifs are much less common than the more neutral motifs. The neutrality of the most popular motifs is essentially a mathematical inevitability: nothing can achieve more than 50% popularity while being used by only 50% of authors. The Gothic mainstream must be defined by that which is available to all authors within the genre. In terms of sheer prevalence, the defining features of the Gothic[^cf27] appear to be fainting (present in 77% of all novels), confinement (66% of novels), abduction (57%), references to suicide (47%), and storms (44%). Only one of those five motifs, suicide (61% male), shows hints of a gendered divide.

## no binaries ##

This motif-based model of the early Gothic suggests that, rather than a balanced oppositions of Radcliffe’s female terror Gothic versus Lewis’s male horror Gothic, the genre as a popular movement was defined by a less-sensationalist (possibly Radcliffean, possibly terror-mode) non-genered Gothic mainstream, with a subset of male horror Gothic writers making up a minor tradition within it. These results serve as a useful reminder that not all contrasts are perfect binaries; the existence of a men’s Gothic tradition does not require that everything outside that tradition be a perfectly-opposed women’s Gothic.

# Frederick Frank #

## Frank values context ##

Having explored one bibliographic model in depth, we now have a point of comparison for our next model of men and women’s Gothics. Although it attempts to model the same field, Frederick Frank’s bibliography encourages a very different understanding of the texts he indexes. Unlike Tracy, Frank is interested in not just what happens, but in how it happens. His “Critical Synopsis” of each text functions entirely differently from Tracy’s “Plot Summary,” often providing very few plot details in favour of describing the work’s literary borrowings, narrative structure, and historical reception.[^cf28] Unlike Tracy, he includes an assessment of each work’s “Gothic type,” but these “types” are not stable overarching categories: for his 500 texts, Frank provides 309 unique classifications.[^cf29] In their flexibility and detail, Frank’s “types” reflect Frow’s understanding of genre: it is impossible to classify each text into the genre to which it “belongs”; instead, Frank describes the generic expectations which each text uses. His Gothic type for Sophia Lee’s The Recess, for example, labels the novel as “Gothified history (terror and sentimental elements), connecting it simultaneously to the “Gothified history” of William Godwin’s St. Leon, the “terror mode” of Radcliffe’s novels, and the “sentimental Gothic” of Charlotte Dacre’s The Libertine and The Passions. These threads cannot be traced systematically — he provides no index or definition of the types themselves. They are hardly even deterministic: The Mysteries of Ferney Castle is listed twice, once under each of its disputed authors, and receives a different Gothic type in each entry (“Pure or high Gothic (terror mode)” at entry 188 by Robert Huish, and “Gothified history (Radcliffean imitation)” at entry 222 by G. Lambe). Instead, his Gothic types model the Gothic as a shifting history, with each novel as the temporary centre of influences that stretch both forward and backward in time.

## my model of Frank ##

Adapting Frank’s model for my own, then, required working somewhat against the grain of his assumptions. However, I have avoided simply assigning each text one simple genre. Instead, I have separated out each strand of influence within his complex “Gothic types”  by dividing each “type” into a set of tags, and tallied the uses of each tag.[^cf30] This process generated 190 unique tags, most of which only applied to one or two works. By rendering the tags individually listable, my model imposes a more systematic ontology than Frank’s. However, because each work is “tagged” numerous times, my model retains the details of each work’s often-idiosyncratic combinations of influences. My approach treats each “tag” as an independent object of inquiry, informative on its own regarding one small facet of a work’s participation in its generic context. I ask whether the association of a given tag with a work constitutes meaningful information regarding the probable gender of that work’s author. Because Frank’s classifications are subjective assessments, an answer of “yes” to this question could have two meanings. When we find, for example, that the “sentimental” tag predicts female authorship, this could indicate either that women really did write more sentimental novels, or that certain common features of the Gothic are more likely to be called sentimental when women write them. Correlating genre tags with less ambiguous features of the work — such as the inclusion of particular motifs — will, later, allow us to examine to what extent Frank is responding to differences in authorial usage. But regardless of their basis, Frank’s assessments are informative about the horizon of critical expectations. Frank’s model of the multiplicity of Gothic subgenres, in the reverse of Tracy, shows an identifiable women’s Gothic, whereas the men’s Gothic is elusive.

## women's Gothic ##

Frank’s women’s Gothic challenges few stereotypes of women’s writing. Like Tracy, he indexes slightly more female authors than male[^cf31]. Three of the most popular tags are even more female-dominated than his woman-heavy sample would lead us to expect: 43% of Frank’s corpus is written by women, but that 43% is responsible for 50% of the “terror” works, 65% of the “Radcliffean” works, and a striking 77% of the “sentimental.” Contemporary criticism has worked to revise the eighteenth-century consensus that the literary sphere was overtaken with a flood of dangerous sentimental literature by and for women: Barbara Benedict, for example, ruthlessly debunks a range of “manifestly untrue” eighteenth-century perceptions of reading demographics,[^cf32] and many others have agreed that most readers and most writers were men, and even that men and women mostly read the same things. However, the preponderance of women writing Frank’s sentimental works suggests a kernel of truth underlying eighteenth-century critics’ panic. It is entirely possible for readers to be mostly male, and authors mostly male, even within the sphere of specifically Gothic publishing, but for female authors to nonetheless write a detectably feminine kind of book. Frank presents us with a Radcliffean, sentimental, terror Gothic which is also a women’s Gothic. This women’s Gothic is exactly the sort subgenre which would be invisible in Tracy’s model, because it doesn’t operate by identifiable motif. If we turn away from a serch for privileged subject matter which only women will think to describe — not subterranean passages or blood — and instead observe the less-quantifiable intangibles that Frank uses — tone, attitude, aesthetics — then we can find a broadly popular women’s Gothic.

## men's Gothic ##

A men’s Gothic is more elusive in Frank’s model. Like in Tracy, the men’s tags generally apply only to very few novels, reflecting a minor tradition. Unlike in Tracy, there are very few of these minor men’s tags. The ones that do exist reinforce the conclusions we drew more strongly based on Tracy’s model. Men outnumber women in the “Germanic” tag (which encompasses “German”, “Germanic”, “Schauerroman”, “Rauberroman”, and “Ritterroman”) — of these 29 Germanic Gothics, 18 are by men (62%). “Horror”, too, is disproportionately male: 42% of “horror” works are by men, a porportion that is solidly above their baseline 31%, though not astonishing. “Lewisite” is about the same (46% male). More strikingly male-dominated are two characteristics which would be invisible in Tracy’s motif-focused view: “polemical” and “prototypical” works. 12 works are identified as “proto” or “early” forms of something else; of those 12, 7 are by men (58%).[^cf33] A slightly larger group of works exists with the tags “polemical,” “philosophical,” “political,” and “radical/revolutionary” — of these 19, 13 are by men (68%). The highest male percentage that applies to more than one work is for “polemical” Gothics, which fiercely flog some viewpoint or another: 83% of the six “polemical” works are by men. The masculine assessment of “polemical” works is particularly suggestive in light of the numbers for “didactic” works, which are entirely neutral (50% each). “Didactic” works are the only works with a persuasive agenda in which men do not dominate, suggesting a qualitative distinction: men can produce confrontational political works, whereas the didactic is a more equal-opportunity field in which women, too, can promote their ideas under the aegis of instruction. Whether the gendered distinction comes from the eighteenth century or the twenty-first, Frank’s model has added an additional dimension to the conclusion we drew from Tracy, that male authors can choose their subject matter more freely.

## mainstream Gothic ##

Frank’s Gothic mainstream is largely non-gendered. The two most prevalent tags in the corpus as a whole, representing all Gothics without attention paid to authorial gender, are “Gothic” (83% of all works) and “pure/high” (39%), both of which have the same gendered distribution of the sample as a whole. Our only hint of a gendered trend among the most widespread tags is the third most prevalent tag, “terror” (34% of works), which, at 50% female, is somewhat above the female baseline of 43%. The next two tags in prominence are not informative about genre variation, but instead highlight the multiplicity of Frank’s assessments: the tags “mode” and “elements” are each applied to 27% of all works in the sample. These terms generally appear as qualifiers for his other assessments, as in “terror mode” or “sentimental elements,” and accordingly remind us to modify the implied force of “terror” and “sentimental” as tags. Indeed, many of Frank’s tags are essentially qualifiers: “mode”, “effects”, “Gothified”, and “imitation,” for example. In Frank’s Gothic typology, then, the Gothic is not monolithic: each work assembles multiple elements, which have their sources elsewhere, and are all interconnected. Nothing for Frank is just one genre. Even horror and terror are far from mutually exclusive. Of the 53 “horror” works, 26 (49%) are also tagged “terror”. These 26 are 50% by men, making the horror-terror mode more predictive of male authorship than horror alone. Of the remaining 27 works which are purely horror, no terror, there are 9 by women, 9 by men, and 9 unknown — a far cry from the horror Gothic as the exclusive province of men. This is the reverse of Tracy — Tracy showed a male horror and equal-opportunity terror mainstream; Frank shows equal-opportunity horror, and female terror. Between the two, the only part that’s consistent is that terror vastly outnumbers horror. There are gendered currents, but none of them are striking enough to start making predictions about the many unsigned works.

# Frank + Tracy #

## this CRIES OUT for correlation ##

Attempting to compare the two models raises the prospect of combining them. It’s been an open question to this point whether Frank’s Gothic types respond to actually gendered usage, or impose their interpretations based on subsequent gendered expectation. When it comes to assessing a work as “polemical” versus “didactic”, for example, the tone difference is a subjective interpretation which could easily be influenced by his knowledge of the author’s gender. In contrast, Tracy’s boolean motifs — although they may be prone to false negatives, and are certainly vague in interpretive detail — are at least safe from these interpretive false positives. We can thus evaluate the potentially-gendered basis of Frank’s type assessments by considering the motifs associated with each tag. Because, as we saw earlier, Tracy’s motifs only render certain kinds of literary features visible, we are now doubly prone to false negatives. However, we can still hope for some true positives. In correlating the two bibliographies, I narrow my attention to the 178 texts included in both works, and ask: does knowing Frank gave a work a certain tag tell us anything about what motifs it probably has? In particular, can the “horror” and “terror” tags be distinguished from each other and from the mainstream by particular motifs?

## some horror motifs ##

The “horror” tag, certainly, is associated with a number of motifs. Predictably, too, the “horror” motifs look similar to the men’s motifs. At the top of the list of “horror” motifs is “Inquisition” — 63% of “horror” Gothics include the Inquisition, an enormous increase over the baseline 15% presence of that motif. This striking result lends credence to the work of scholars like Robert Miles who take conspiracy as a central horror-Gothic concern. Next, less expectedly, are secret doors, at the exact same level of increase — 48% more secret doors in “horror” novels than in the corpus as a whole. “Horror” Gothics also have 47% more prophetic dreams, 46% more corpses, 40% more drugging, and 39% more banishment than the corpus as a whole. These motifs remain distinctly associated with “horror” when we instead compare “horror” directly to “terror,” rather than comparing the corpus as a whole: all of these occur two to three times more often with the “horror” tag than with “terror”. Horror and terror are most sharply distinguished from each other, though, by “actual incest”, which occurs five times more often with “horror” than with “terror”. As when Tracy was considered alone, this minor motif has strong predictive power.[^cf34] The next strongest distinguishing motifs are “Satan and lesser demons” and “loose woman”, both of which appear four times more frequently in “horror” than in “terror”. Three times more frequent in “horror” works are “rape”, “pre-nuptial death”, and “banishment.” All of these motifs paint a distinct horror tradition, which our earlier models also allow us to see as male. But they also complicate our understanding of “horror” by introducing motifs which were previously not male-dominated enough to become part of the categorical definition.

## weaker terror motifs ##

The “terror” tag, as expected, is less strongly defined by its motifs. Several motifs do appear with slightly higher frequency within “terror” works than in the baseline, but generally only by a few percentage points. 43 motifs appear in “horror” works with a 20% or greater increase in frequency over their baseline prevalence, but not one motif crosses that threshold for “terror.” If we examine the top of the “terror” list anyway, the tag shows an anemic increase in fainting (19% more than baseline), suicide mentions (18%), female fainting (18%), and secret doors (18%) compared to the overall corpus, but all of these mostifs appear more in “horror” works than they do in “terror.” Fainting, suicide, and secret doors might allow us to spot terror or horror Gothics against a background of sentimental Gothics or other modes, but they are not useful in defining a terror/horror divide. We can more directly seek that distinction by comparing “terror” only to “horror,” but from this view too, however, there are fewer motifs, with weaker correlations. Whereas there were three motifs which appeared four or five times more often in horror works than terror works, there are no motifs which distinguish terror that strongly. One motif does appear with triple frequency in terror works compared to horror: “speech, unfinished, on deathbed.”  Appearing a little more than twice as often are “good abbess”, and “good clergyman,” and a little less than twice are “attempted or contemplated suicide” and “lunacy.” None of these motifs drew our attention when we examined Tracy alone, because they are not strongly gendered. It is potentailly fruitful to see them distinguished now, and consider them as potential markers of a terror Gothic as distinct from a women’s Gothic. But they ultimately reaffirm that the terror Gothic itself is simply the Gothic mainstream.

# Frank-and-Tracy-based conclusion #

This correlation confirms a conclusion drawn from examining just Tracy’s motifs, that the men’s Gothic might operate via striking images but the women’s Gothic less so. Men’s horror is a minor tradition within the genre, easy to single out for censure but not the most widely-imitated. Men’s and women’s schools do indeed exist, but that they do not map neatly to a set of female/male terror/horror Radcliffe/Lewis binaries, and that both gendered schools are dwarfed by a largely non-gendered Gothic mainstream. These findings serve as a a useful reminder that not all contrasts are perfect binaries; the existence of a men’s Gothic tradition does not require that everything outside that tradition be a perfectly-opposed women’s Gothic. They also suggest that, when we are seduced by the scenery of the Gothic, we end up paying attention to only a minor thread within it — men’s horror Gothics — at the expense of less-graspable but equally-crucial features which better define the mainstream.

# male is the gender that shapes writing: men can write what they want #

# Works Cited #

Juliann Fleenor, The Female Gothic
David Richter, The Gothic Novel and the Lingering Appeal of Romance
Robert Miles
Barbara Benedict’s “‘Male’ and ‘Female’ Novels?”
Heather Love, Thin Description
Lee Erickson’s review of Garside & Raven Modern Philology, Vol. 101, No. 4 (May 2004)
Garside & Raven
Oxford Handbook of the Novel (for authorship demographic stats; I probably need more support for this)
Drucker, Humanities Approaches to Graphical Display
McCarty, modelling
Stephen Ramsay
Leah Price, The Anthology and the Rise of the Novel
Ann Tracy
Frederick Frank


[^cf1]: CITE  Juliann Fleenor, The Female Gothic, 7

[^cf2]: CITE Fleenor 28

[^cf3]: cite Robert Miles

[^cf4]: CITE The Gothic Novel and the Lingering Appeal of Romance p 479

[^cf5]: CITE p 364

[^cf6]: CITE Heather Love, Thin Description, p. 404

[^cf7]: CITE Heather Love, Thin Description. p. 407

[^cf8]: CITE Love 377

[^cf9]: CITE review Modern Philology, Vol. 101, No. 4 (May 2004), pp. 622-626

[^cf10]: Indeed, each works’ basic bibliographical data is improved in the Garside— one of my early steps was to check both Frank and Tracy against Garside, which allowed me to correct some errors in publication dates and titles, and revealed a handful of new authorship attributions for unsigned works. Except for the authorship attributions, these differences have no impact on my experiments, but all discrepancies between Frank or Tracy and Garside have been silently amended in favour of Garside.

[^cf11]: Although she includes a few works that are chronological outliers, Tracy’s emphasis is firmly on the years indicated on her title, 1790-1830

[^cf12]: cite Oxford Handbook

[^cf13]: cite Drucker

[^cf14]: cite McCarty

[^cf15]: cite McCarty

[^cf16]: cite Ramsay

[^cf17]: cite McCarty

[^cf18]: cite Leah Price

[^cf19]: cite Price 13

[^cf20]: The Garside bibliography, too, is a model, with its own particular concerns. It emphasizes “the full title given to the work, the imprint of the original publisher(s), and unmediated information as to how authorship was first signified,” reflecting an interest in “the ways in which novels were first projected at their readers” (“‘Ordering’ Novels: Describing Prose Fiction, 1770-1832” p. 388), and so the notes include information about dedicatees, issue variations, subscription lists, included advertisements, subsequent editions, translations, and attributions. The key editorial intervention is the inclusion of contemporary reviews. Together, these details build a model of a public sphere of letters, in which the Gothic is just one of many markets.

[^cf21]: cite Tracy 195

[^cf22]: cite tracy 195

[^cf23]: cite tracy 74

[^cf24]: Due to Tracy’s interest in uniqueness, 138 of the 208 motifs she indexes appear in fewer than 20 novels, and have thus been excluded from this study. Most motifs contain a number of sub-categories. In most cases, I further distilled each motif to its simplest form by ignoring these sub-categories. “Poison,” for example, is indexed with categories for “blade,” “chaplet,” “kiss,” “letter,” “orange,” “plant on grave,” and “sacrificial wine”, but I have elided these nuances in favor of a broader motif of “poison (all subcategories),” which applies to 30 novels. In cases where a sub-category contains more than 20 novels in and of itself, I have graphed that sub-category as if it were its own motif. “Death,” for example, is divided into the sub-categories “emotionally induced,” “pre-nuptial,” and “sad and/or pious,” of which both “emotionally induced” and “sad/pious” include more than 20 novels. Ultimately, the 70 key motifs generated 92 charts.

[^cf25]: I chose pie charts, one per motif, to visually represent Tracy’s treatment of each motif as a self-contained field which may or may not have distinct divisions within it. The size of each circle reflects the prevalence of the motif within the body of indexed novels as whole. More subtly, the difference between the two shades of gray in each chart reflects the difference between the two percentages. I wished to avoid graphs whose labels said that a motif featured a 50/50 split, but whose stark contrast nonetheless implied that books by male versus female authors could be easily distinguished from each other. Instead, I wanted my reader's ease in distinguishing between male and female authors to be directly connected to the ease with which a reader in the 1790s might have been able to accomplish the same task if given only the information that a certain motif was present. Accordingly, if the motif itself is not useful as a tool to distinguish between two gendered camps, its chart doesn’t show two camps.

[^cf26]: I interpret a motif to be “distinctly male” if 60% or more of its authors are male.

[^cf27]: That is, the defining features of the Gothic which nonetheless struck Ann Tracy as singular enough to be worth indexing — castles, for example, might have topped this list, if they hadn’t been considered too common to index. However, convents, ghosts, and corpses were all in the running for defining motifs, but were insuffiiently prevalent.

[^cf28]: The two bibliographies’ treatments of Grenville Fletcher’s Rosalviva, Or, The Demon Dwarf, for example, serves as a useful illustration of their differences. Tracy’s summary is a litany of events: it begins matter-of-factly with the sentence “Leontini loves Viola di Morini, but she marries someone else,” and is equally unfazed when the titular “demon dwarf” arrives in the third act and when the dwarven appearance turns out to be false (51). Frank, in contrast, spends more than half his words on context, as in his first sentence: 
	“From Rumplestilskin in the fairytale to the comic evil of Dickens’s Daniel Quilp in The Old Curiosity Shop (1841), the figure of the dwarf was often called upon to perform such demonic services as vengeance, prophecy, child possession, and transformation.” (107) 
	To this broad literary history he adds Mary Shelley’s story “Transformation” as potential precursor for the disguise in Fletcher’s novel, and includes several assessments of the Gothic’s particular embellishments of “the dwarf as a resolver of dilemmas of identity” (107) and “dwarfs... spin[ning] webs of murderous intrigue for diabolic ladies” (108). All of these details stand in stark contrast to Tracy’s unembellished list of seven novels under the index entry “dwarf” (199), which treats the sinister disguise in Rosalviva as interchangeable with depictions of non-supernatural and even non-evil little people.

[^cf29]: Most of these are “unique” primarily from the point of view of a spreadsheet: “Domestic fiction (various Gothic elements)” and “Domestic fiction (intermittent Gothic elements),” for example, are distinguished only by a slight gradation of degree. But this interest in slight qualitative gradations is what distinguishes Frank’s model from Tracy’s.

[^cf30]: First, Frank’s phrases were split so that each word became one tag. Radcliffe’s The Italian, listed as “Pure or high Gothic (terror and horror modes)” becomes “Pure”, “or”, “high”, “Gothic”, “terror”, “horror”, and “modes.” Then, conjunctions were deleted, and synonyms combined. Frank always uses the phrase “Pure or high” in its entirety, for example, so the tags “Pure”, “or”, and “high” were merged into one tag “Pure;high”.

[^cf31]: His corpus is 43% female, 31% male, 26% unknown. Tracy’s is 50% female,  45% male, 5% unknown.

[^cf32]: cite ‘Male’ and ‘Female’ novels, p. 361

[^cf33]: This evocative detail could either suggest that the Gothic’s roots are more masculine than its popular flourishing, or that critical attention is more likely to credit male authors with originating important literary forms. Twelve is a sufficiently tiny sample, however, that the tools at hand are too crude for further exploration regarding which explanation is more likely, or whether there is, in fact, a phenomenon requiring explanation here.

[^cf34]: Interestingly, this represents 3 “horror” tagged works and 2 “terror” tagged works. One of those “terror” works is Matthew Lewis’s The Monk, which is tagged as both “horror” and “terror”, but the other is Ancient Records, Or, The Abbey Of Saint Oswythe, by T. J. Horsley Curties, which is only tagged “terror”. Two other works containing “incest, actual” are not tagged as either “horror” nor “terror”. Having reached clusters of only two or three texts, however, these samples are too small to bear sustained statistical scrutiny.
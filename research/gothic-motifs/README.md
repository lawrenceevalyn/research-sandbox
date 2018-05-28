# My proposed experiment

1. Train a binary classifier on some of the books with "gothic motifs" which have known authorial genders.
2. Test on some other books with "gothic motifs" that also have known genders.
3. See if "motifs" can accurately guess gender. (I SERIOUSLY doubt that any one motif can do this alone, but combinations may be effective. This is where I think the CS question lies: how can you use ~200 factors for classification?)
4. Try the most effective motif-based gender-guessing metrics on the "unsigned" works to guess the genders of those unknown authors.
5. Repeat with "gothic types."
6. Repeat with "gothic types" + "gothic motifs" in combination.

## My research questions:
* Can "gothic motifs" be used to identify author gender?
* Can "gothic tags" be used to identify author gender?
* Can "gothic motifs" and "gothic tags" combined identify author gender?
* If the answer to any of the above is "yes": how many of the "unknown" works are probably by men vs women?

(My hypotheses: Gothic motifs will be more useful than gothic types. Men will be easier to spot than women. A low percentage of unsigned works are by men.)

# Spreadsheets for Gothic motifs and tags

These spreadsheets contain a total of 528 books, with 345 "features" to try to identify their authors' genders.

I have standardized all column names across these three spreadsheets, so it should be possible to "join" them with minimal distress.

## Tracy-motifs

This spreadsheet contains 208 books as rows, and 153 "features" as columns, mostly motifs.

Most motifs columns contain either a "1" indicating the presence of that motif or a blank indicating the absence of that motif.

Some motif columns instead list strings, or numbers larger than 1, to deal with motif subcategories. For example:

| confinement (any) | extralegal confinement | legal confinement | legality of confinement |
|-------------------|------------------------|-------------------|-------------------------|
| 1                 | 1                      |                   | extra                   |
| 1                 |                        | 1                 | legal                   |
| 2                 | 1                      | 1                 | both                    |

The first row is "Gender-Tracy," which contains either "m", "f", or "unknown". This is the feature I want to use all the other information to try to predict.

Each book has a unique "Tracy No." which is the number it was assigned in Tracy's bibiliography.

## Frank-tags

This spreadsheet contains 499 books as rows, and 192 "features" as columns, which are all "tags" except for the first two columns (which are Gender-Frank and Frank No.)

Each column name will consist of one or more words which I considered to represent one "tag", and the column will contain the actual word from that "tag" which appeared in the description of the work. For example:

| chapbook;Chapbook;bluebook |
|----------------------------|
| chapbook                   |
| bluebook                   |
| Chapbook                   |
| chapbook                   |

The tag names are extremely messy because I haven't renamed them after merging similar words together. I suggest treating the tags as strings and mostly ignoring what they say. It would be acceptable to ignore the specific content of the tag column and just treat the presence of a string like a 1 and the absence of a string like a 0. Please do *not* change the tags/column names, however.

The first row is "Gender-Frank," which contains either "m", "f", or "unknown". This is the feature I want to use all the other information to try to predict.

Each book has a unique "Frank No." which is the number it was assigned in Frank's bibiliography.

## Frank-Tracy-basics

This spreadsheet contains more details on the Frank works (like title, author name, etc).

More importantly, it includes all "Tracy No." and "Frank No." numbers relative to each other so that Tracy-motifs and Frank-tags can be joined. Most works have *either* a Frank No. *or* a Tracy No., but I think 167 works do have both, which will be reflected in this spreadsheet. For example:

| Tracy No. | Frank No. | Title-Frank                      |
|-----------|-----------|----------------------------------|
|           | 16        | HERMSPRONG: OR, MAN,AS HE IS NOT |
| 1         | 17        | THE BLACK ROBBER. A ROMANCE      |
| 7         |           |                                  |
# research-sandbox

Research side projects and ideas in development of various kinds. Intentionally open-ended: don't try to impose structure, just let things accumulate naturally.

# notes to self

By FAR the easiest way to find TCP XML files of particular plays is at http://ota.ox.ac.uk/tcp/ -- search by title, then right-click save-as the "source."

# research log

## July 27, 2019

Who is George Bridgetower, "son to the African prince"?? Who is the African prince??

...Oh. He already has a wikipedia page. https://en.wikipedia.org/wiki/George_Bridgetower

## July 11, 2018

Qatar national library: https://www.qdl.qa/en

## May 28, 2018

btw if Weka gives an error and refuses to open a CSV, make sure there is a carriage return at the end of the last line of the CSV

Tracy-no-strings-2: In cleaning gothic-motifs data for computational classification, I deleted the human-readable column for any set of subcategories that had three or more options. So, e.g., "fainting (any)" with the subcategories "m", "f", or "both", remains, because those 3 states are........fine, to me, somehow. (Though I may drop this later since it's redundant?) But "deathbed (any)" with "agonies", "emotional", "agonies and sad", "sad and interrupted", etc, does NOT stay in the summative "kind of deathbed" column, because there are too many combos.

It runs WAY worse when I try to only classify based on attributes that I think are meaningful. More data = better.

Best accuracy is 59% with Tracy-no-strings (NOT 2) with Logistic
Even better is 66% with Frank
Worst is actually Frank-Tracy-combined: 60%

"what I can tell you is machines love data, and machines love it if you give them hints. 'oh? is sentimental a code word for female? I LOVE code words for female!'"

"ohhh, it's 1 2 3 4 horse all over again"

"we are dealing with the 'magical incantation' phase of the learning process"

Frank alone is more accurate than Tracy AND more accurate than Frank-Tracy-inside-join (because Frank-Tracy-inside-join is fewer books)

## April 27, 2018

Process to make shakespeare network graphs:

in Data Laboratory, copy "character1_speech" column to "weight" column
Apply Force Atlas 2 with Shakey01 defaults
Apply Fruchterman Reingold.
Set edge colours "ranking" by weight to grayscale
in preview, set to Shakey01 preset
render
save as png

## February 8, 2018

It seemed like I needed something like this, so I set it up.
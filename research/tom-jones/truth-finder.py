import re	#regular expressons
import csv

### defining various inputs ###
input = "Tom-Jones.txt"
output = "output.csv"

verbRegex = "\sto\s(.|..|...|....|.....|......|.......|........|.........|..........|...........|............|.............|..............|...............)\s(truth|the\struth|truly)"
# look for something that follows one of these patterns:
	# "to ____ the truth"
	# "to ____ truth"
	# "to ____ truly"
# (this regex needs the word "to", then a space, then 1-15 characters of any kind, then a space, then either "truth", "the truth", or "truly".)

testRegex = "(truth|the\struth|truly)"

### definining variables
list = []

### define how the program will run ###
def find(regex,text):
	lineno = 0
	with open(text,"r") as file:
		for line in file:
			lineno += 1
			if re.search(regex,line):
				print(lineno)
				print(line)
				#list.append(line) # put the matching line in a list
	
### actually run the program ###
find (verbRegex,input)


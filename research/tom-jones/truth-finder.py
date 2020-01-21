import re	#regular expressons

input = "Tom-Jones.txt" #change as needed
output = "output.csv"

verbRegex = "to\s(.|..|...|....|.....|......|.......|........|.........|..........|...........|............|.............|..............|...............)\s(truth|the\struth|truly)"
# look for something that follows one of these patterns:
	# "to ____ the truth"
	# "to ____ truth"
	# "to ____ truly"
# (this regex needs the word "to", then a space, then 1-15 characters of any kind, then a space, then either "truth", "the truth", or "truly".)

# truthRegex = 


def find(regex,text):
	with open(text,"r") as file:
		for line in file:
			if "Allworthy" in line:
				print(line)
				# add it to the output csv
	
find (verbRegex,input)
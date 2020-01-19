# open Tom-Jones.txt

# first I want to see all the possible strings I should consider!
# for each line, look for something that follows one of these patterns:
	# "to ____ the truth"
	# "to ____ truth"

	# if a line matches, put it in a new row in a csv
	# also add the line number to another column in that row

# after I've done the above, I'll write code that does this part:
# for each line, look for any of my chosen strings:
	# "to say the truth"
	# "to say truth"
	# "to speak the truth"
	# "to speak truly"
	# "to speak more truly"
	# "to confess the truth"
	# "why should we not confess the truth"
	
	# if a line matches, put it in a new row in a csv
	# also add the line number to another column in that row
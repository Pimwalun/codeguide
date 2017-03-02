##1Don't Repeat Yourself

####1.Duplication is waste

Every line of code that goes into an application must be maintained, and is a potential source of future bugs. Duplication needlessly bloats the codebase, resulting in more opportunities for bugs and adding accidental complexity to the system. The bloat that duplication adds to the system also makes it more difficult for developers working with the system to fully understand the entire system, or to be certain that changes made in one location do not also need to be made in other places that duplicate the logic they are working on. DRY requires that "every piece of knowledge must have a single, unambiguous, authoritative representation within a system."

	

##2.Meaningful Names
###Use Intention-Revealing Names
It is easy to say that names should reveal intent. What we want to impress upon you is that
we are serious about this.

The name of a variable, function, or class, should answer all the big questions. It
should tell you why it exists, what it does, and how it is used.

	Example
	String n; / Student name
	
We should choose a name that specifies what is being measured and the unit of that measurement.Variable should be start with a lowercase.

	Example
	String studentName;
	
###Class Names
Avoid words like Manager, Processor, Data, or Info in the name of a class. A class name should not be a verb
###Method Names
Methods should have verb or verb phrase names like postPayment, deletePage, or save

	Example
	student.setName();
	student.grtName();


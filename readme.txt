
2nd commit: "OnClick added for Item-click"

We can do it using kotlin lambda expressions and higher order functions.

To implement a click listener,
we will do two things. We will add a lambda expression as a parameter to the composable. Input data type

of it must be the data type of selected item.

In our case we will select

a string. So the input data type should be string.

If we are selecting a User object, then the input data type of the lambda expression would be User.

----------------------------
commit: better recycling approach:

We could write all the codes to display our data in a single disposable. That’s what we have being doing

during this tutorial for our previous LazyColumn

and Scrollable Column examples.

But if we do so, Since this layout has a lot of components It would be a very difficult to read,

Difficult to maintain

code.

Therefore following the best practices we write this code as 3 separate composables.
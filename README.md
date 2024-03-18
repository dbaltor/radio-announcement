Given a time in the format of hh:mm (12-hour format) 0 < hh < 12, 0 <= mm < 60. The task is to convert it into words as shown:

Examples :

Input : h = 5, m = 0
Output : `five o' clock`

Input : h = 6, m = 24
Output : `twenty four minutes past six`

The corner cases are m = 0, m = 15, m = 30, m = 45, h = 0 and h = 12.

```
6:00 six o'clock
3:10 ten minutes past three
9:15 quarter past nine
10:30 half past ten
6:45 quarter to seven
6:47 thirteen minutes to seven
0:00 midnight
11:55 five to midnight
12:00 noon
12:15 quarter past noon
```

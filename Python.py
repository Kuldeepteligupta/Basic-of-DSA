from tkinter import*
import tkinter as tk


import statistics
root=Tk()
root.geometry("2000x1000")
font0=['Times',25,'normal']
font1=['Times',20,'normal']
font2=['Times',14,'normal']
font3 =['Times',12,'normal']


e1_str=StringVar()
e1=tk.Entry(root, width=20, bg='skyblue', font=font1, textvariable=e1_str).grid(row=2,column=5,padx=15,pady=10)
lbl2=tk.Label(root, text='', height=4, font=font2, anchor='w',justify='center', width=40,bg='lightblue')
lbl2.grid(row=4,column=5,padx=25,columnspan=3,sticky='w')

button=tk.Radiobutton(root, text='MEAN', width=20, bg= 'skyblue',activebackground='grey', font=font1, command=lambda:mean()).grid(row=4, column=1,pady=20)
button2=tk.Radiobutton(root, text='MEDIAN', width=20, bg= 'skyblue', activebackground='grey',font=font1, command=lambda:median()).grid(row=5, column=1,pady=20)
button3=tk.Radiobutton(root, text='MODE', width=20, bg= 'skyblue',activebackground='grey', font=font1, command=lambda:mode()).grid(row=6, column=1,pady=20)
button4=tk.Radiobutton(root, text='GEOMETRIC MEAN', width=20, bg= 'skyblue', activebackground='grey',font=font1, command=lambda:gm()).grid(row=7, column=1,pady=20)
button5=tk.Radiobutton(root, text='HARMONIC MEAN', width=20, bg= 'skyblue',activebackground='grey', font=font1, command=lambda:hm()).grid(row=8, column=1,pady=20)



my_label=tk.Label(root, text='ENTER DATA',font=font1).grid(row=1, column=5)
my_label1=tk.Label(root, text='by Kuldeep', font=font0).grid(row=2, column=1)
my_label2=tk.Label(root, text='Static Calculator',font=font1).grid(row=1, column=1)
my_label2=tk.Label(root, text='Result',font=font0).grid(row=3, column=5)


def mean():
   my_list=list(map(int,e1_str.get().split(',')))
   str1="NO OF ELEMENTS:" + str(len(my_list))
   str1=str1 +" \n SUM OF ELEMENTS : " + str(sum(my_list))
   str1=str1 + "\n MEAN: " + str(statistics.mean(my_list))
   lbl2.config(text=str1)

def median():
    my_list=list(map(int,e1_str.get().split(',')))
    str1="NO OF ELEMENTS:" + str(len(my_list))
    str1=str1 + "\n MEDIAN: " + str(statistics.median(my_list))
    lbl2.config(text=str1)

def mode():
    my_list=list(map(int,e1_str.get().split(',')))
    str1="NO OF ELEMENTS:" + str(len(my_list))
    str1=str1 + "\n MODE: " + str(statistics.mode(my_list))
    lbl2.config(text=str1)
def gm():
    my_list=list(map(int,e1_str.get().split(',')))
    str1="NO OF ELEMENTS:" + str(len(my_list))
    str1=str1 + "\n GEOMETRIC MEAN: " + str(statistics.geometric_mean(my_list))
    lbl2.config(text=str1)

def hm():
    my_list=list(map(int,e1_str.get().split(',')))
    str1="NO OF ELEMENTS:" + str(len(my_list))
    str1=str1 + "\n HARMONIC MEAN: " + str(statistics.harmonic_mean(my_list))
    lbl2.config(text=str1)


  
root.mainloop()

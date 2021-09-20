package kry;
import java.util.Scanner;
public class getword {
//============================================================
public int lengthword;
public String word="";
public int chiff;
public String anfang_wert="";
public String sig="";
public int try_number;
public int curser_place;
public int win_wsol; 
public int n=1;
public int wino_last;
//============================================================
public String get_the_null_val() {
this.anfang_wert="";
for (int i=0;i<this.chiff;i++){
this.anfang_wert+=this.word.charAt(0);}		
return this.anfang_wert ;} 
//============================================================
public void get_it() {
Scanner het = new Scanner(System.in);
System.out.println("put the characters");
this.word=het.nextLine();
System.out.println("how many place ");
this.chiff=het.nextInt();
het.close(); 
this.lengthword=this.word.length();
power(this.lengthword,this.chiff);
curser_place= this.chiff-2;
this.win_wsol=1;}
//============================================================
public void losungen () {
StringBuilder rapido =new StringBuilder(this.anfang_wert);int n=-1;
for (int i=1;i<=this.try_number;i++) {n++;
rapido.setCharAt((this.chiff-1),this.word.charAt(n));
if(n==(this.lengthword-1)) { 
rapido.setCharAt((this.chiff-1),this.word.charAt(n));
System.out.println("the combination n: "+i+" "+rapido);n=-1;
for (int j=(this.chiff-1);j>=0;j--){
if( (rapido.charAt(j)!=this.word.charAt(this.lengthword-1))){	
int w=poss(rapido.charAt(j),this.word);			
rapido.setCharAt((j),this.word.charAt(w+1));
break;}else if ((rapido.charAt(j)==this.word.charAt(this.lengthword-1))) { 
rapido.setCharAt((j),this.word.charAt(0));}}}else {System.out.println("the combination n: "+i+" "+rapido);}}}
//=========================================================================================================
public int poss(char z,String word2) {
int r=0;
for (int i=0;i<word2.length();i++){
if (word2.charAt(i)==z) {
r=i;break;}	}return r;	}
//=========================================================================================================
public int pos(char z,StringBuilder rapido) {
int r=0;
for (int i=0;i<rapido.length();i++){
if (rapido.charAt(i)==z) {
r=i;break;}}return r;	}
//=========================================================================================================
public void power(int a , int b) {
this.try_number = 1;while (b != 0) {
this.try_number *= a;--b;}} 
//============================================================
public int power2(int a , int b) {
int r=1;while (b != 0){r *= a;b--;}return r;}
//==========================================================================================================================
}
//==========================================================================================================================
	

 

	
	






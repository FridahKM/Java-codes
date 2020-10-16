import java.util.*;
public class CovidEmulation{
	public static void main(String[] args){
int people;
		//declare variables for covid status
		int positive =0;
		int negative =0;
		
		//declare variables for counties
		int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,i=0,j=0,k=0,l=0,m=0,n=0,o=0,p=o,q=0,r=0,s=0,t=0,u=0,v=0,w=0,x=0,y=0,z=0;
		int aa=0,bb=0,cc=0,dd=0,ee=0,ff=0,gg=0,hh=0,ii=0,jj=0,kk=0,ll=0,mm=0,nn=0,oo=0,pp=o,qq=0,rr=0,ss=0,tt=0,uu=0;
		
		//declare variable for age brackets
		int ZZ=0, YY=0, XX=0, WW=0, VV=0;
		for(people=1;people<=5000;people++){
		
		//randomly generate values for status
		int status=(int)Math.round(Math.random()*1);
			if(status==1){
				positive = positive+1;
			}else{
				negative = negative+1;
			}
		//generate random values for counties
		int county=(int)Math.round(1+Math.random()*46);
		
		if(county==1){
			a=a+1;
		} else if(county==2){
			b=b+1;
		}else if(county==3){
			c=c+1;
		}else if(county==4){
			d=d+1;
		}else if(county==5){
			e=e+1;
		}else if(county==6){
			f=f+1;
		}else if(county==7){
			g=g+1;
		}else if(county==8){
			h=h+1;
		}else if(county==9){
			i=i+1;
		}else if(county==10){
			j=j+1;
		}else if(county==11){
			k=k+1;
		}else if(county==12){
			l=l+1;
		}else if(county==13){
			m=m+1;
		}else if(county==14){
			n=n+1;
		}else if(county==15){
			o=o+1;
		}else if(county==16){
			p=p+1;
		}else if(county==17){
			q=q+1;
		}else if(county==18){
			r=r+1;
		}else if(county==19){
			s=s+1;
		}else if(county==20){
			t=t+1;
		}else if(county==21){
			u=u+1;
		}else if(county==22){
			v=v+1;
		}else if(county==23){
			w=w+1;
		}else if(county==24){
			x=x+1;
		}else if(county==25){
			y=y+1;
		}else if(county==26){
			z=z+1;
		}else if(county==27){
			aa=aa+1;
		}else if(county==28){
			bb=bb+1;
		}else if(county==29){
			cc=cc+1;
		}else if(county==30){
			dd=dd+1;
		}else if(county==31){
			ee=ee+1;
		}else if(county==32){
			ff=ff+1;
		}else if(county==33){
			gg=gg+1;
		}else if(county==34){
			hh=hh+1;
		}else if(county==35){
			ii=ii+1;
		}else if(county==36){
			jj=jj+1;
		}else if(county==37){
			kk=kk+1;
		}else if(county==38){
			ll=ll+1;
		}else if(county==39){
			mm=mm+1;
		}else if(county==40){
			nn=nn+1;
		}else if(county==41){
			oo=oo+1;
		}else if(county==42){
			pp=pp+1;
		}else if(county==43){
			qq=qq+1;
		}else if(county==44){
			rr=rr+1;
		}else if(county==45){
			ss=ss+1;
		}else if(county==46){
			tt=tt+1;
		}else if(county==47){
			uu=uu+1;
		}
		
		//generate random values for ages
		int age=(int)Math.round(1+Math.random()*5);
		
		if(age==1){
			ZZ=ZZ+1;
			}else if(age==2){
			YY=YY+1;
			}else if(age==3){
			XX=XX+1;
			}else if(age==4){
			WW=WW+1;
			}else if(age==5){
			VV=VV+1;
			}
		}
		//output sum of cases in each instance
		System.out.println("positive\t\tnegative");
		System.out.println(positive+"\t\t\t"+negative);
		
		//output sum of cases in each county
		System.out.println("a\tb\tc\td\te\tf\tg\th\ti\tj\tk");
		System.out.println(a+"\t"+b+"\t"+c+"\t"+d+"\t"+e+"\t"+f+"\t"+g+"\t"+h+"\t"+i+"\t"+j+"\t"+k);
		System.out.println();
		System.out.println();
		System.out.println("l\tm\tn\to\tp\tq\tr\ts\tt\tu");
		System.out.println(l+"\t"+m+"\t"+n+"\t"+o+"\t"+p+"\t"+q+"\t"+r+"\t"+s+"\t"+t+"\t"+u);
		System.out.println();
		System.out.println();
		System.out.println("v\tw\tx\ty\tz\taa\tbb\tcc\tdd\tee");
		System.out.println(v+"\t"+w+"\t"+x+"\t"+y+"\t"+z+"\t"+aa+"\t"+bb+"\t"+cc+"\t"+dd+"\t"+ee);
		System.out.println(); 
		System.out.println();
		System.out.println("ff\tgg\thh\tii\tjj\tkk\tll\tmm\tnn\too");
		System.out.println(ff+"\t"+gg+"\t"+hh+"\t"+ii+"\t"+jj+"\t"+kk+"\t"+ll+"\t"+mm+"\t"+nn+"\t"+oo);
		System.out.println();
		System.out.println();
		System.out.println("pp\tqq\trr\tss\ttt\tuu");
		System.out.println(pp+"\t"+qq+"\t"+rr+"\t"+ss+"\t"+tt+"\t"+uu);
		System.out.println();
		System.out.println();
		
		//output sum of cases in each age bracket
		System.out.println("0-5\t\t5-30\t\t30-50\t\t50-60\t\t60-80");
		System.out.println(ZZ+"\t\t"+YY+"\t\t"+XX+"\t\t"+WW+"\t\t"+VV);
		
}
}

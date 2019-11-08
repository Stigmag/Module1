package com.nix.module1;


public class ValidString {
    public boolean isValid(String text)
    {int check1=0;
        int check2=0;
        int check3=0;
        if(text.contains("(")&& text.contains(")") && text.contains("{")&& text.contains("}")&& text.contains("[")&& text.contains("]"))
        {
            for(int i=0;i<text.length();i++)
            {
                if(text.toCharArray()[i]=='(')
                {
                    check1+=1;
                }
                if(text.toCharArray()[i]=='[')
                {
                    check2+=1;
                }
                if(text.toCharArray()[i]=='{')
                {
                    check3+=1;
                }
            }
            for(int i=0;i<text.length();i++)
            {
                if(text.toCharArray()[i]==')')
                {
                    check1-=1;
                }
                if(text.toCharArray()[i]==']')
                {
                    check2-=1;
                }
                if(text.toCharArray()[i]==']')
                {
                    check3-=1;
                }
            }
            if(check1==0 && check2==0 && check3==0){
          if(  text.indexOf("(")>text.indexOf(")") )
          {
              if(  text.indexOf("[")>text.indexOf("]"))
              {
                  if(  text.indexOf("{")>text.indexOf("}"))
                  {
                      return true;
                  }
              }
          }}

        }


        return false;
    }
}

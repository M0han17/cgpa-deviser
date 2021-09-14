package cgpaCalculation;
public class RoundOff {
   public static float round(float x){
   if((x < 5.4f)&&(x >= 5.0f)){return 5.0f;}
   else if((x < 5.85f)&&(x >= 5.4f)){return 5.5f;}
   else if((x < 6.4f)&&(x >= 5.85f)){return 6.0f;}
   else if((x < 6.85f)&&(x >= 6.4f)){return 6.5f;}
   else if((x < 7.4f)&&(x >= 6.85f)){return 7.0f;}
   else if((x < 7.85f)&&(x >= 7.4f)){return 7.5f;}
   else if((x < 8.4f)&&(x >= 7.85f)){return 8.0f;}
   else if((x < 8.85f)&&(x >= 8.4f)){return 8.5f;}
   else if((x < 9.4f)&&(x >= 8.85f)){return 9.0f;}
   else if((x < 9.85f)&&(x >= 9.4f)){return 9.5f;}
   else if(x > 9.85f){return 10.0f;}
   else if((x < 5.0f)||(x >= 10.0f)){System.out.println("Invalid !!");}
   return 0.0f;
}
}

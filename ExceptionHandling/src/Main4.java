import java.util.*;

public class Main4

{

public static void main(String[] args)

{

try

{

int i = Integer.parseInt("Thor");

}

catch(Exception ex)

{

System.out.println("This block handles all exception types");

}

catch(NumberFormatException ex)

{

System.out.print("This block handles NumberFormatException");

}

}

}
package com.example.mai.learner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
WebView webView;
    String[] py = {
            "Python Intro", "Python Get Started", "Python Syntax", "Python Comments", "Python Variables", "Python Data Types", "Python Numbers", "Python Casting", "Python Strings", "Python Booleans", "Python Operators", "Python Lists", "Python Tuples", "Python Sets", "Python Dictionaries", "Python If...Else", "Python While Loops", "Python For Loops", "Python Functions", "Python Lambda", "Python Arrays", "Python Classes/Objects", "Python Inhe,itance", "Python Iterators", "Python Scope", "Python Modules", "Python Dates", "Python Math", "Python JSON", "Python RegEx", "Python PIP", "Python Try...Except", "Python User Input", "Python Formatting"};
    String[] java = {"Java Intro", "Java Get Started", "Java Syntax", "Java Output", "Java Comments", "Java Variables", "Java Data Types", "Java Type Casting", "Java Operators", "Java Strings", "Java Math", "Java Booleans", "Java If...Else", "Java Switch", "Java While Loop", "Java For Loop", "Java Break/Continue", "Java Arrays",};
    String[] c = {"C GET STARTED", "C Synatx", "C Output", "C Comments", "C Variables", "C Data Types", "C Constants", "C Operators", "C if...Else", "C Switch", "C While Loop", "C For Loop", "C Break/Continue", "C Arrays", "C Strings", "C User Input", "C Memory Address", "C Pointers"};
String[] pywb={"https://www.w3schools.com/python/python_intro.asp","https://www.w3schools.com/python/python_getstarted.asp",
        "https://www.w3schools.com/python/python_syntax.asp","https://www.w3schools.com/python/python_comments.asp",
        "https://www.w3schools.com/python/python_comments.asp","https://www.w3schools.com/python/python_datatypes.asp",
        "https://www.w3schools.com/python/python_numbers.asp","https://www.w3schools.com/python/python_casting.asp",
        "https://www.w3schools.com/python/python_strings.asp","https://www.w3schools.com/python/python_booleans.asp",
        "https://www.w3schools.com/python/python_operators.asp","https://www.w3schools.com/python/python_lists.asp",
        "https://www.w3schools.com/python/python_lists.asp","https://www.w3schools.com/python/python_tuples.asp",
        "https://www.w3schools.com/python/python_sets.asp","https://www.w3schools.com/python/python_dictionaries.asp",
        "https://www.w3schools.com/python/python_conditions.asp","https://www.w3schools.com/python/python_while_loops.asp",
        "https://www.w3schools.com/python/python_for_loops.asp","https://www.w3schools.com/python/python_functions.asp",
        "https://www.w3schools.com/python/python_lambda.asp","https://www.w3schools.com/python/python_arrays.asp",
        "https://www.w3schools.com/python/python_classes.asp","https://www.w3schools.com/python/python_inheritance.asp",
        "https://www.w3schools.com/python/python_iterators.asp","https://www.w3schools.com/python/python_scope.asp",
        "https://www.w3schools.com/python/python_modules.asp","https://www.w3schools.com/python/python_datetime.asp",
        "https://www.w3schools.com/python/python_math.asp","https://www.w3schools.com/python/python_json.asp",
        "https://www.w3schools.com/python/python_regex.asp","https://www.w3schools.com/python/python_pip.asp",
        "https://www.w3schools.com/python/python_try_except.asp","https://www.w3schools.com/python/python_user_input.asp",
        "https://www.w3schools.com/python/python_string_formatting.asp"};
String[] cweb={"https://www.w3schools.com/c/c_getstarted.php","https://www.w3schools.com/c/c_syntax.php",
        "https://www.w3schools.com/c/c_output.php","https://www.w3schools.com/c/c_comments.php",
        "https://www.w3schools.com/c/c_variables.php","https://www.w3schools.com/c/c_data_types.php",
        "https://www.w3schools.com/c/c_constants.php","https://www.w3schools.com/c/c_operators.php",
        "https://www.w3schools.com/c/c_conditions.php","https://www.w3schools.com/c/c_switch.php",
        "https://www.w3schools.com/c/c_while_loop.php","https://www.w3schools.com/c/c_for_loop.php",
        "https://www.w3schools.com/c/c_break_continue.php","https://www.w3schools.com/c/c_arrays.php",
        "https://www.w3schools.com/c/c_strings.php","https://www.w3schools.com/c/c_user_input.php",
        "https://www.w3schools.com/c/c_memory_address.php","https://www.w3schools.com/c/c_memory_address.php"};
String[] jweb={"http://w3schools.com/java/java_intro.asp","https://www.w3schools.com/java/java_getstarted.asp","https://www.w3schools.com/java/java_syntax.asp",
        "https://www.w3schools.com/java/java_output.asp","https://www.w3schools.com/java/java_comments.asp",
        "https://www.w3schools.com/java/java_variables.asp","https://www.w3schools.com/java/java_data_types.asp",
        "https://www.w3schools.com/java/java_type_casting.asp","https://www.w3schools.com/java/java_operators.asp",
        "https://www.w3schools.com/java/java_strings.asp","https://www.w3schools.com/java/java_math.asp",
        "https://www.w3schools.com/java/java_booleans.asp","https://www.w3schools.com/java/java_conditions.asp",
        "https://www.w3schools.com/java/java_switch.asp","https://www.w3schools.com/java/java_while_loop.asp",
        "https://www.w3schools.com/java/java_for_loop.asp","https://www.w3schools.com/java/java_break.asp",
        "https://www.w3schools.com/java/java_arrays.asp"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        WebView webView=findViewById(R.id.web);
      String check=getIntent().getStringExtra("kit");
for(int i=0;i<c.length;i++){
    if(check.compareTo(c[i])==0){
webView.loadUrl(cweb[i]);
webView.getSettings().setJavaScriptEnabled(true);
webView.setWebViewClient(new WebViewClient());
break;
    }
}
        for(int i=0;i<java.length;i++){
            if(check.compareTo(java[i])>=0){
                webView.loadUrl(jweb[i]);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.setWebViewClient(new WebViewClient());
                break;
            }
        }
        for(int i=0;i<py.length;i++){
            if(check.compareTo(py[i])>=0){
                webView.loadUrl(pywb[i]);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.setWebViewClient(new WebViewClient());
                break;
            }
        }
      }
    }

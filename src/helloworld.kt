/**
 * Created by ericl on 7/19/2017.
 */


fun hello(name : String = "") : String {

    if(name.trim() == "")
        return "Hello, World!"
    else
        return "Hello, $name!"
}
def urlify(string: String): String = 
    string.replace(" ", "%20")

@main def main() = 
    assert(urlify("Mr 3ohn Smith") == "Mr%203ohn%20Smith")

// Methods can be invoked with a short-hand notation:
url = URLEncoder.encode 'This:is&url/encoded\\url'
println url



def methodName() {
    // Method code
}

def sum(parameter1, parameter2 = 0, parameter3 = 0) {
    total = parameter1 + parameter2 + parameter3
    println total
    return total
}

sum 3

def map = [:]

map.put('a',1)


def properties = map.collect { key, value -> return key+'='+value }

println map
println properties

println properties.getClass()




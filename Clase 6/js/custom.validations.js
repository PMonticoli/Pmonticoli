$.validator.addMethod("onlyNumbers", function(value, element){
    console.log(value);
    return !isNaN(value);
}, "Ingrese solo dígitos.");

/** 
getHashTags("How the Avocado Became the Fruit of the Global Trade")
--> ["#avocado", "#became", "#global"]

getHashTags("Why You Will Probably Pay More for Your Christmas Tree This Year")
--> ["#christmas", "#probably", "#will"]

getHashTags("Hey Parents, Surprise, Fruit Juice Is Not Fruit")
--> ["#surprise", "#parents", "#fruit"]

getHashTags("Visualizing Science")
--> ["#visualizing", "#science"]

**/

function hash(input){
    const words = input.split(' ');
    for(let i = 0; i < words.length - 1; i++){
        // if(words[i].indexOf(words[i].length - 1) === ","){
        //     let temp = words[i].replace(',', '');
        //     words[i].replace(words[i], temp);
        // }
        for(let j = i + 1; j < words.length; j++){
            if(words[i].length < words[j].length){
                let temp = words[i];
                words[i] = words[j];
                words[j] = temp;
            }
        }
        
    }

    for(let i = 0; i < 3; i++){
        if(words[i] != undefined){
            console.log("#"+words[i]);
        }
        
    }
}

hash("How the Avocado Became the Fruit of the Global Trade");
console.log("============================================================");
hash("Why You Will Probably Pay More for Your Christmas Tree This Year");
console.log("============================================================");
hash("Hey Parents, Surprise, Fruit Juice Is Not Fruit");
console.log("============================================================");
hash("Visualizing Science");
console.log("============================================================");
console.log("============================================================");
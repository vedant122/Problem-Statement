
var time=setInterval(image,1000)
time=0;
function image(){
    let i1=document.getElementById("i1");
    if(time<5){
        i1.src="https://st1.bgr.in/wp-content/uploads/2021/03/OnePlus-9-Pro.jpg";
    }
    else if(time<10){
        i1.src="https://i2.wp.com/thegadgetsfreak.com/wp-content/uploads/2019/03/Xiaomi-Black-Shark-2-Phone-Car.jpg?fit=1920%2C1080";
    }
    else if(time<15){
        i1.src="https://www.91-cdn.com/hub/wp-content/uploads/2021/02/asus_rog_phone_5_featured-1.jpg";
    }
    else if(time<20){
        i1.src="https://images.samsung.com/au/smartphones/galaxy-note20/images/galaxy-note20-share-image.jpg";
    }
    else if(time<25){
        i1.src="https://pbs.twimg.com/media/EkPwXrzXsAY0o9G.jpg";
    }
    else if(time>=25){
        time=0;
    }
    time=time+1;
}


function home(){
    scrollTo(0,0);
}
function pre(){
    scrollTo(0,800)
}
function mid(){
    scrollTo(0,3100);
}
function low(){
    scrollTo(0,5400)
}
function top1(){
    scrollTo(0,0)
}

function payment1(){
    let pop=document.getElementsByClassName("buy2");
    let pop1=document.getElementById("popup");
    if(pop){
        pop1.style.visibility="visible";
    }
}

function back(){
    let pop1=document.getElementById("popup");
    if(pop1){
        pop1.style.visibility="hidden";
        document.getElementById("name").value="";
        document.getElementById("surname").value="";
        document.getElementById("mobile").value="";
        document.getElementById("fbno").value="";
        document.getElementById("address").value="";
        document.getElementById("city").value="";
    }
}


function submit1(){
    let name1=document.getElementById("name").value
    let surname1=document.getElementById("surname").value
    let mobile1=document.getElementById("mobile").value
    let fbno1=document.getElementById("fbno").value
    let address1=document.getElementById("address").value
    let city1=document.getElementById("city").value
    let pop1=document.getElementById("popup");
    
    
    fetch('http://localhost:8080/insert', {
        method: 'POST',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({
            name:name1,
            surname:surname1,
            mobileNumber:mobile1,
            fbno:fbno1,
            address:address1,
            city:city1
        })
    })
    
    pop1.style.visibility="hidden";
    if(pop1.style.visibility=="hidden"){
        alert("Your order is placed")
    }
    document.getElementById("name").value="";
    document.getElementById("surname").value="";
    document.getElementById("mobile").value="";
    document.getElementById("fbno").value="";
    document.getElementById("address").value="";
    document.getElementById("city").value="";
}    

const button1=document.getElementById("button1");
button1.addEventListener('click',submit1)

function nightmode(){
    let i=document.getElementById("day");
    if(i){
    document.body.style.backgroundColor="black";
    }
}
function daymode(){
    let i=document.getElementById("day")
    if(i){
       document.body.style.backgroundColor="white"; 
    }
}
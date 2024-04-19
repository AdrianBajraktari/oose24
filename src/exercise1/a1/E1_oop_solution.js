let alice = {
    age: 24,
    firstName: "Alice",
    lastName: "Wonderland",
    getName: function() {
        return `${this.firstName} ${this.lastName}`;
    }
}

let roleStudent = {
    getNameAndMatNr() {
        return `${this.getName()}, ${this.matNr}`;
    },
    getDetails() {
        return `${this.getNameAndMatNr()}, studies ${this.studySubject}.`;
    }
}

let roleTutor = {
    getWorkDescription() {
        return `${this.getName()} has an ${this.hours}h contract as a tutor for ${this.module} and offers exercises at the following dates: ${this.times}.`
    }
}

let rolePhD = {
    getWorkDescription() {
        return `${this.getName()} is a PhD student at the ${this.chair} chair, studying ${this.studySubject}.`
    }
}

function clone(object) {
    let clone = {};
    for(let key in object) {
        clone[key] = object[key];
    }
    return clone;
}

function makeTutor(person, module, hours, times) {
    let tutor = clone(roleTutor);
    tutor.__proto__ = person;
    tutor.module = module;
    tutor.hours = hours;
    tutor.times = times;
    return tutor;
}

function makeStudent(person, matNr, studySubject) {
    let student = clone(roleStudent);
    student.__proto__ = person;
    student.matNr = matNr;
    student.studySubject = studySubject;
    return student;
}

function makePhD(person, studySubject, chair) {
    let phd = clone(rolePhD);
    phd.__proto__ = person;
    phd.studySubject = studySubject;
    phd.chair = chair;

    return phd;
}


let roleStudentAlice = makeStudent(alice, 9349458, "computer science");
console.log(roleStudentAlice.getDetails())

let roleTutorAlice = makeTutor(alice, "oose", 8, ["monday, 14:00-16:30", "wednesday, 12:00-13:30"]);
console.log(roleTutorAlice.getWorkDescription())

let rolePhDAlice = makePhD(alice, "software engineering", "SSE");
console.log(rolePhDAlice.getWorkDescription())
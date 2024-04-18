let roleStudent = {
    getNameAndMatNr() {
        return `${FULL NAME}, ${MATNR}`;
    },
    getDetails() {
        return `${NAME & MATNR}, studies ${SUBJECT}.`;
    }
}

let roleTutor = {
    getWorkDescription() {
        return `${FULL NAME} has an ${HOURS}h contract as a tutor for ${MODULE} and offers exercises at the following dates: ${EXERCISE TIMES}.`
    }
}

let rolePhD = {
    getWorkDescription() {
        return `${FULL NAME} is a PhD student at the ${CHAIR} chair, studying ${SUBJECT}.`
    }
}

function clone(object) {
    let clone = {};
    for(let key in object) {
        clone[key] = object[key];
    }
    return clone;
}

let roleStudentAlice = makeStudent(alice, 9349458, "computer science");
console.log(roleStudentAlice.getDetails())

let roleTutorAlice = makeTutor(alice, "oose", 8, ["monday, 14:00-16:30", "wednesday, 12:00-13:30"]);
console.log(roleTutorAlice.getWorkDescription())

let rolePhDAlice = makePhD(alice, "software engineering", "SSE");
console.log(rolePhDAlice.getWorkDescription())
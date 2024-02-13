let project = new_java_project();

let req_1 = new_by_hidden_test_grader()
    .url("https://www.dropbox.com/s/rdekvma3lx2gz17/ProgrammingPractice2Test.java?raw=1")
    .test_class_name("ProgrammingPractice2Test")
    .out_of(70.0)
    .req_name("Hidden Tests")
    .run();

    let reqs = [req_1];

show_results(reqs, #{
    "show_table": true,
    "results_json": false,
    "feedback": false,
    "leaderboard": false,
    "debug": true
});

generate_feedback([req_1])
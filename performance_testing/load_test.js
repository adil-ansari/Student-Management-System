import http from 'k6/http'
import {sleep, check} from 'k6'

export const options = {
    stages:[
        {duration: '5s', target: 200},
        {duration: '10s', target: 200},
        {duration: '5s', target: 0},
    ]

}

export default () =>{
    http.get('http://host.docker.internal:51462/students')
    // check(res,{'200' : (r)=> r.status == 200})
    sleep(1)
}
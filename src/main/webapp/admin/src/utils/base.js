const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm9p3y7/",
            name: "ssm9p3y7",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm9p3y7/front/h5/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "在线医疗信息服务系统"
        } 
    }
}
export default base

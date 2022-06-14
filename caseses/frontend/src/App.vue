<script setup></script>

<template>
  <header>
    <div class="wrapper">
      <h3>Öğrenciler</h3>
      <table>
        <th>Öğrenci Adı</th>
        <th>Veli Adı</th>

        <tr v-for="(item, index) in studentList" v-bind:key="index">
          <td></td>
        </tr>
      </table>
    </div>
  </header>
</template>

<script>
export default {

  data(){
    return {
      studentList: [],
    },
          created(){
            //this.fetchData();
        };   
  
}
}
</script>

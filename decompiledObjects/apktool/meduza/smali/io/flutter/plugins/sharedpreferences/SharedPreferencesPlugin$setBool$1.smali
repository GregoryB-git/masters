.class final Lio/flutter/plugins/sharedpreferences/SharedPreferencesPlugin$setBool$1;
.super Lwb/i;
.source "SourceFile"

# interfaces
.implements Ldc/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/flutter/plugins/sharedpreferences/SharedPreferencesPlugin;->setBool(Ljava/lang/String;ZLio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lwb/i;",
        "Ldc/p<",
        "Lnc/d0;",
        "Lub/e<",
        "-",
        "Lrb/h;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lwb/e;
    c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setBool$1"
    f = "SharedPreferencesPlugin.kt"
    l = {
        0x46
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public final synthetic $key:Ljava/lang/String;

.field public final synthetic $value:Z

.field public label:I

.field public final synthetic this$0:Lio/flutter/plugins/sharedpreferences/SharedPreferencesPlugin;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lio/flutter/plugins/sharedpreferences/SharedPreferencesPlugin;ZLub/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/flutter/plugins/sharedpreferences/SharedPreferencesPlugin;",
            "Z",
            "Lub/e<",
            "-",
            "Lio/flutter/plugins/sharedpreferences/SharedPreferencesPlugin$setBool$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/flutter/plugins/sharedpreferences/SharedPreferencesPlugin$setBool$1;->$key:Ljava/lang/String;

    iput-object p2, p0, Lio/flutter/plugins/sharedpreferences/SharedPreferencesPlugin$setBool$1;->this$0:Lio/flutter/plugins/sharedpreferences/SharedPreferencesPlugin;

    iput-boolean p3, p0, Lio/flutter/plugins/sharedpreferences/SharedPreferencesPlugin$setBool$1;->$value:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lwb/i;-><init>(ILub/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lub/e;)Lub/e;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lub/e<",
            "*>;)",
            "Lub/e<",
            "Lrb/h;",
            ">;"
        }
    .end annotation

    new-instance p1, Lio/flutter/plugins/sharedpreferences/SharedPreferencesPlugin$setBool$1;

    iget-object v0, p0, Lio/flutter/plugins/sharedpreferences/SharedPreferencesPlugin$setBool$1;->$key:Ljava/lang/String;

    iget-object v1, p0, Lio/flutter/plugins/sharedpreferences/SharedPreferencesPlugin$setBool$1;->this$0:Lio/flutter/plugins/sharedpreferences/SharedPreferencesPlugin;

    iget-boolean v2, p0, Lio/flutter/plugins/sharedpreferences/SharedPreferencesPlugin$setBool$1;->$value:Z

    invoke-direct {p1, v0, v1, v2, p2}, Lio/flutter/plugins/sharedpreferences/SharedPreferencesPlugin$setBool$1;-><init>(Ljava/lang/String;Lio/flutter/plugins/sharedpreferences/SharedPreferencesPlugin;ZLub/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnc/d0;

    check-cast p2, Lub/e;

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/sharedpreferences/SharedPreferencesPlugin$setBool$1;->invoke(Lnc/d0;Lub/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lnc/d0;Lub/e;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnc/d0;",
            "Lub/e<",
            "-",
            "Lrb/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/sharedpreferences/SharedPreferencesPlugin$setBool$1;->create(Ljava/lang/Object;Lub/e;)Lub/e;

    move-result-object p1

    check-cast p1, Lio/flutter/plugins/sharedpreferences/SharedPreferencesPlugin$setBool$1;

    sget-object p2, Lrb/h;->a:Lrb/h;

    invoke-virtual {p1, p2}, Lio/flutter/plugins/sharedpreferences/SharedPreferencesPlugin$setBool$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lvb/a;->a:Lvb/a;

    iget v1, p0, Lio/flutter/plugins/sharedpreferences/SharedPreferencesPlugin$setBool$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/flutter/plugins/sharedpreferences/SharedPreferencesPlugin$setBool$1;->$key:Ljava/lang/String;

    invoke-static {p1}, Lx6/b;->j(Ljava/lang/String;)Lr0/d$a;

    move-result-object p1

    iget-object v1, p0, Lio/flutter/plugins/sharedpreferences/SharedPreferencesPlugin$setBool$1;->this$0:Lio/flutter/plugins/sharedpreferences/SharedPreferencesPlugin;

    invoke-static {v1}, Lio/flutter/plugins/sharedpreferences/SharedPreferencesPlugin;->access$getContext$p(Lio/flutter/plugins/sharedpreferences/SharedPreferencesPlugin;)Landroid/content/Context;

    move-result-object v1

    const/4 v3, 0x0

    if-eqz v1, :cond_3

    invoke-static {v1}, Lio/flutter/plugins/sharedpreferences/SharedPreferencesPluginKt;->access$getSharedPreferencesDataStore(Landroid/content/Context;)Lo0/i;

    move-result-object v1

    new-instance v4, Lio/flutter/plugins/sharedpreferences/SharedPreferencesPlugin$setBool$1$1;

    iget-boolean v5, p0, Lio/flutter/plugins/sharedpreferences/SharedPreferencesPlugin$setBool$1;->$value:Z

    invoke-direct {v4, p1, v5, v3}, Lio/flutter/plugins/sharedpreferences/SharedPreferencesPlugin$setBool$1$1;-><init>(Lr0/d$a;ZLub/e;)V

    iput v2, p0, Lio/flutter/plugins/sharedpreferences/SharedPreferencesPlugin$setBool$1;->label:I

    invoke-static {v1, v4, p0}, Lr0/e;->a(Lo0/i;Ldc/p;Lub/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Lrb/h;->a:Lrb/h;

    return-object p1

    :cond_3
    const-string p1, "context"

    invoke-static {p1}, Lec/i;->i(Ljava/lang/String;)V

    throw v3
.end method

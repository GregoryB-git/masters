.class public final Lga/i$c;
.super Lwb/i;
.source "SourceFile"

# interfaces
.implements Ldc/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lga/i;->c(Lr0/d$a;Ljava/lang/Object;Lub/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lwb/i;",
        "Ldc/p<",
        "Lr0/a;",
        "Lub/e<",
        "-",
        "Lrb/h;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lwb/e;
    c = "com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$2"
    f = "SettingsCache.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public synthetic a:Ljava/lang/Object;

.field public final synthetic b:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field public final synthetic c:Lr0/d$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr0/d$a<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final synthetic d:Lga/i;


# direct methods
.method public constructor <init>(Lr0/d$a;Lga/i;Ljava/lang/Object;Lub/e;)V
    .locals 0

    iput-object p3, p0, Lga/i$c;->b:Ljava/lang/Object;

    iput-object p1, p0, Lga/i$c;->c:Lr0/d$a;

    iput-object p2, p0, Lga/i$c;->d:Lga/i;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lwb/i;-><init>(ILub/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lub/e;)Lub/e;
    .locals 4
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

    new-instance v0, Lga/i$c;

    iget-object v1, p0, Lga/i$c;->b:Ljava/lang/Object;

    iget-object v2, p0, Lga/i$c;->c:Lr0/d$a;

    iget-object v3, p0, Lga/i$c;->d:Lga/i;

    invoke-direct {v0, v2, v3, v1, p2}, Lga/i$c;-><init>(Lr0/d$a;Lga/i;Ljava/lang/Object;Lub/e;)V

    iput-object p1, v0, Lga/i$c;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lr0/a;

    check-cast p2, Lub/e;

    invoke-virtual {p0, p1, p2}, Lga/i$c;->create(Ljava/lang/Object;Lub/e;)Lub/e;

    move-result-object p1

    check-cast p1, Lga/i$c;

    sget-object p2, Lrb/h;->a:Lrb/h;

    invoke-virtual {p1, p2}, Lga/i$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    sget-object v0, Lvb/a;->a:Lvb/a;

    .line 2
    .line 3
    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lga/i$c;->a:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Lr0/a;

    .line 9
    .line 10
    iget-object v0, p0, Lga/i$c;->b:Ljava/lang/Object;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v1, p0, Lga/i$c;->c:Lr0/d$a;

    .line 15
    .line 16
    invoke-virtual {p1, v1, v0}, Lr0/a;->d(Lr0/d$a;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget-object v0, p0, Lga/i$c;->c:Lr0/d$a;

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    const-string v1, "key"

    .line 26
    .line 27
    invoke-static {v0, v1}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Lr0/a;->c()V

    .line 31
    .line 32
    .line 33
    iget-object v1, p1, Lr0/a;->a:Ljava/util/Map;

    .line 34
    .line 35
    invoke-interface {v1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    :goto_0
    iget-object v0, p0, Lga/i$c;->d:Lga/i;

    .line 39
    .line 40
    invoke-static {v0, p1}, Lga/i;->a(Lga/i;Lr0/a;)V

    .line 41
    .line 42
    .line 43
    sget-object p1, Lrb/h;->a:Lrb/h;

    .line 44
    .line 45
    return-object p1
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

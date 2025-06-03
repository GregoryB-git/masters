.class public final Lnb/h$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnb/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnb/h$b$a;
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Ljava/lang/Object;

.field public final c:Lnb/e;

.field public final d:Leb/l0;

.field public e:Leb/n;

.field public f:Leb/k0$j;

.field public g:Z

.field public final synthetic h:Lnb/h;


# direct methods
.method public constructor <init>(Lnb/h;Lnb/h$c;Lgb/r2;Leb/k0$d;)V
    .locals 0

    iput-object p1, p0, Lnb/h$b;->h:Lnb/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lnb/h$b;->a:Ljava/lang/Object;

    iput-object p3, p0, Lnb/h$b;->d:Leb/l0;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lnb/h$b;->g:Z

    iput-object p4, p0, Lnb/h$b;->f:Leb/k0$j;

    const/4 p1, 0x0

    iput-object p1, p0, Lnb/h$b;->b:Ljava/lang/Object;

    new-instance p1, Lnb/e;

    new-instance p2, Lnb/h$b$a;

    invoke-direct {p2, p0}, Lnb/h$b$a;-><init>(Lnb/h$b;)V

    invoke-direct {p1, p2}, Lnb/e;-><init>(Lnb/c;)V

    iput-object p1, p0, Lnb/h$b;->c:Lnb/e;

    sget-object p2, Leb/n;->a:Leb/n;

    iput-object p2, p0, Lnb/h$b;->e:Leb/n;

    invoke-virtual {p1, p3}, Lnb/e;->i(Leb/l0;)V

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "Address = "

    .line 2
    .line 3
    invoke-static {v0}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lnb/h$b;->a:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    const-string v1, ", state = "

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Lnb/h$b;->e:Leb/n;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v1, ", picker type: "

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    iget-object v1, p0, Lnb/h$b;->f:Leb/k0$j;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v1, ", lb: "

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, Lnb/h$b;->c:Lnb/e;

    .line 42
    .line 43
    invoke-virtual {v1}, Lnb/e;->g()Leb/k0;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    iget-boolean v1, p0, Lnb/h$b;->g:Z

    .line 55
    .line 56
    if-eqz v1, :cond_0

    .line 57
    .line 58
    const-string v1, ", deactivated"

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    const-string v1, ""

    .line 62
    .line 63
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    return-object v0
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

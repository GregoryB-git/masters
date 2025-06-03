.class public abstract Leb/k0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Leb/k0$d;,
        Leb/k0$c;,
        Leb/k0$k;,
        Leb/k0$i;,
        Leb/k0$e;,
        Leb/k0$b;,
        Leb/k0$f;,
        Leb/k0$g;,
        Leb/k0$j;,
        Leb/k0$h;
    }
.end annotation


# static fields
.field public static final b:Leb/a$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Leb/a$b<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "*>;>;"
        }
    .end annotation
.end field

.field public static final c:Leb/k0$b$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Leb/k0$b$b<",
            "Leb/k0$k;",
            ">;"
        }
    .end annotation
.end field

.field public static final d:Leb/a$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Leb/a$b<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static final e:Leb/a$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Leb/a$b<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public a:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Leb/a$b;

    .line 2
    .line 3
    const-string v1, "internal:health-checking-config"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Leb/a$b;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Leb/k0;->b:Leb/a$b;

    .line 9
    .line 10
    new-instance v0, Leb/k0$b$b;

    .line 11
    .line 12
    invoke-direct {v0}, Leb/k0$b$b;-><init>()V

    .line 13
    .line 14
    .line 15
    sput-object v0, Leb/k0;->c:Leb/k0$b$b;

    .line 16
    .line 17
    new-instance v0, Leb/a$b;

    .line 18
    .line 19
    const-string v1, "internal:has-health-check-producer-listener"

    .line 20
    .line 21
    invoke-direct {v0, v1}, Leb/a$b;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    sput-object v0, Leb/k0;->d:Leb/a$b;

    .line 25
    .line 26
    new-instance v0, Leb/a$b;

    .line 27
    .line 28
    const-string v1, "io.grpc.IS_PETIOLE_POLICY"

    .line 29
    .line 30
    invoke-direct {v0, v1}, Leb/a$b;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    sput-object v0, Leb/k0;->e:Leb/a$b;

    .line 34
    .line 35
    new-instance v0, Leb/k0$a;

    .line 36
    .line 37
    invoke-direct {v0}, Leb/k0$a;-><init>()V

    .line 38
    .line 39
    .line 40
    return-void
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Leb/k0$h;)Leb/e1;
    .locals 3

    .line 1
    iget-object v0, p1, Leb/k0$h;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Leb/k0;->b()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    sget-object v0, Leb/e1;->n:Leb/e1;

    .line 16
    .line 17
    const-string v1, "NameResolver returned no usable address. addrs="

    .line 18
    .line 19
    invoke-static {v1}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iget-object v2, p1, Leb/k0$h;->a:Ljava/util/List;

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v2, ", attrs="

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    iget-object p1, p1, Leb/k0$h;->b:Leb/a;

    .line 34
    .line 35
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {v0, p1}, Leb/e1;->g(Ljava/lang/String;)Leb/e1;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p0, p1}, Leb/k0;->c(Leb/e1;)V

    .line 47
    .line 48
    .line 49
    return-object p1

    .line 50
    :cond_0
    iget v0, p0, Leb/k0;->a:I

    .line 51
    .line 52
    add-int/lit8 v1, v0, 0x1

    .line 53
    .line 54
    iput v1, p0, Leb/k0;->a:I

    .line 55
    .line 56
    if-nez v0, :cond_1

    .line 57
    .line 58
    invoke-virtual {p0, p1}, Leb/k0;->d(Leb/k0$h;)V

    .line 59
    .line 60
    .line 61
    :cond_1
    const/4 p1, 0x0

    .line 62
    iput p1, p0, Leb/k0;->a:I

    .line 63
    .line 64
    sget-object p1, Leb/e1;->e:Leb/e1;

    .line 65
    .line 66
    return-object p1
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

.method public b()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public abstract c(Leb/e1;)V
.end method

.method public d(Leb/k0$h;)V
    .locals 2

    iget v0, p0, Leb/k0;->a:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Leb/k0;->a:I

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Leb/k0;->a(Leb/k0$h;)Leb/e1;

    :cond_0
    const/4 p1, 0x0

    iput p1, p0, Leb/k0;->a:I

    return-void
.end method

.method public e()V
    .locals 0

    return-void
.end method

.method public abstract f()V
.end method

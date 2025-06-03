.class public final Lea/e0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lea/m0;

.field public final b:Ldc/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldc/a<",
            "Ljava/util/UUID;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ljava/lang/String;

.field public d:I

.field public e:Lea/x;


# direct methods
.method public constructor <init>()V
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public constructor <init>(I)V
    .locals 2

    .line 1
    sget-object p1, Lp2/m0;->c:Lp2/m0;

    .line 2
    sget-object v0, Lea/d0;->a:Lea/d0;

    const-string v1, "uuidGenerator"

    .line 3
    invoke-static {v0, v1}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lea/e0;->a:Lea/m0;

    iput-object v0, p0, Lea/e0;->b:Ldc/a;

    invoke-virtual {p0}, Lea/e0;->a()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lea/e0;->c:Ljava/lang/String;

    const/4 p1, -0x1

    iput p1, p0, Lea/e0;->d:I

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lea/e0;->b:Ldc/a;

    invoke-interface {v0}, Ldc/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/UUID;

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "uuidGenerator().toString()"

    invoke-static {v0, v1}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "-"

    const-string v2, ""

    invoke-static {v0, v1, v2}, Llc/h;->m0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "this as java.lang.String).toLowerCase(Locale.ROOT)"

    invoke-static {v0, v1}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

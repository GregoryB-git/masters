.class public final Li2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li2/a$a;
    }
.end annotation


# static fields
.field public static final e:Li2/a;


# instance fields
.field public final a:Li2/f;

.field public final b:Ljava/util/List;

.field public final c:Li2/b;

.field public final d:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Li2/a$a;

    .line 2
    .line 3
    invoke-direct {v0}, Li2/a$a;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Li2/a$a;->b()Li2/a;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Li2/a;->e:Li2/a;

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(Li2/f;Ljava/util/List;Li2/b;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Li2/a;->a:Li2/f;

    .line 5
    .line 6
    iput-object p2, p0, Li2/a;->b:Ljava/util/List;

    .line 7
    .line 8
    iput-object p3, p0, Li2/a;->c:Li2/b;

    .line 9
    .line 10
    iput-object p4, p0, Li2/a;->d:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method

.method public static e()Li2/a$a;
    .locals 1

    .line 1
    new-instance v0, Li2/a$a;

    .line 2
    .line 3
    invoke-direct {v0}, Li2/a$a;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Li2/a;->d:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public b()Li2/b;
    .locals 1

    .line 1
    iget-object v0, p0, Li2/a;->c:Li2/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public c()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Li2/a;->b:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public d()Li2/f;
    .locals 1

    .line 1
    iget-object v0, p0, Li2/a;->a:Li2/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public f()[B
    .locals 1

    .line 1
    invoke-static {p0}, Lf2/m;->a(Ljava/lang/Object;)[B

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

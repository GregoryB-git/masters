.class public final Ly4/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly4/b$a;
    }
.end annotation


# static fields
.field public static final b:Ly4/b;


# instance fields
.field public final a:Ly4/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ly4/b$a;

    .line 2
    .line 3
    invoke-direct {v0}, Ly4/b$a;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ly4/b$a;->a()Ly4/b;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Ly4/b;->b:Ly4/b;

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(Ly4/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ly4/b;->a:Ly4/a;

    .line 5
    .line 6
    return-void
.end method

.method public static b()Ly4/b$a;
    .locals 1

    .line 1
    new-instance v0, Ly4/b$a;

    .line 2
    .line 3
    invoke-direct {v0}, Ly4/b$a;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public a()Ly4/a;
    .locals 1

    .line 1
    iget-object v0, p0, Ly4/b;->a:Ly4/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public c()[B
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/google/firebase/messaging/M;->a(Ljava/lang/Object;)[B

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

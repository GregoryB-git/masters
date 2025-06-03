.class public final Lp6/D0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp6/X;
.implements Lp6/r;


# static fields
.field public static final o:Lp6/D0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lp6/D0;

    .line 2
    .line 3
    invoke-direct {v0}, Lp6/D0;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lp6/D0;->o:Lp6/D0;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b()V
    .locals 0

    .line 1
    return-void
.end method

.method public d(Ljava/lang/Throwable;)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method

.method public getParent()Lp6/q0;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "NonDisposableHandle"

    .line 2
    .line 3
    return-object v0
.end method

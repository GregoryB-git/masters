.class public final synthetic LZ0/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LW2/g;


# instance fields
.field public final synthetic o:LZ0/h;


# direct methods
.method public synthetic constructor <init>(LZ0/h;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LZ0/g;->o:LZ0/h;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LZ0/g;->o:LZ0/h;

    .line 2
    .line 3
    check-cast p1, LZ0/s;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, LZ0/h;->q(LZ0/s;)LZ0/s;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

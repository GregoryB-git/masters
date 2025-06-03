.class public final Lx1/g$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx1/g$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx1/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "refresh_access_token"

    .line 5
    .line 6
    iput-object v0, p0, Lx1/g$c;->a:Ljava/lang/String;

    .line 7
    .line 8
    const-string v0, "ig_refresh_token"

    .line 9
    .line 10
    iput-object v0, p0, Lx1/g$c;->b:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lx1/g$c;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lx1/g$c;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

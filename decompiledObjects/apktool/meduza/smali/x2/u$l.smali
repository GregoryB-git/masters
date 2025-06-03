.class public final Lx2/u$l;
.super Lp1/p;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx2/u;-><init>(Lp1/j;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# direct methods
.method public constructor <init>(Lp1/j;)V
    .locals 0

    invoke-direct {p0, p1}, Lp1/p;-><init>(Lp1/j;)V

    return-void
.end method


# virtual methods
.method public final c()Ljava/lang/String;
    .locals 1

    const-string v0, "UPDATE workspec SET state=? WHERE id=?"

    return-object v0
.end method

.class public final Le5/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Le5/e;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Le5/e;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Le5/e;-><init>(I)V

    iput-object v0, p0, Le5/f;->a:Le5/e;

    return-void
.end method

.class public final Le5/g$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le5/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:Lb5/e;

.field public b:Z

.field public c:Landroid/net/Uri;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Le5/g$b;->a:Lb5/e;

    const/4 v1, 0x0

    iput-boolean v1, p0, Le5/g$b;->b:Z

    iput-object v0, p0, Le5/g$b;->c:Landroid/net/Uri;

    return-void
.end method

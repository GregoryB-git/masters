.class public final Lt5/s$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt5/k$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt5/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Lt5/a0;

.field public b:Ljava/lang/String;

.field public c:I

.field public d:I

.field public e:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lt5/a0;

    invoke-direct {v0}, Lt5/a0;-><init>()V

    iput-object v0, p0, Lt5/s$a;->a:Lt5/a0;

    const/16 v0, 0x1f40

    iput v0, p0, Lt5/s$a;->c:I

    iput v0, p0, Lt5/s$a;->d:I

    return-void
.end method


# virtual methods
.method public final a()Lt5/k;
    .locals 7

    new-instance v6, Lt5/s;

    iget-object v1, p0, Lt5/s$a;->b:Ljava/lang/String;

    iget v2, p0, Lt5/s$a;->c:I

    iget v3, p0, Lt5/s$a;->d:I

    iget-boolean v4, p0, Lt5/s$a;->e:Z

    iget-object v5, p0, Lt5/s$a;->a:Lt5/a0;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lt5/s;-><init>(Ljava/lang/String;IIZLt5/a0;)V

    return-object v6
.end method

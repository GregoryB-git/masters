.class public final Li1/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:F

.field public final c:F

.field public final d:I

.field public final e:I

.field public final f:F

.field public final g:F

.field public final h:I

.field public final i:F

.field public final j:I


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 11

    .line 1
    const v9, -0x800001

    const/high16 v10, -0x80000000

    const v2, -0x800001

    const v3, -0x800001

    const/high16 v4, -0x80000000

    const/high16 v5, -0x80000000

    const v6, -0x800001

    const v7, -0x800001

    const/high16 v8, -0x80000000

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v10}, Li1/e;-><init>(Ljava/lang/String;FFIIFFIFI)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;FFIIFFIFI)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li1/e;->a:Ljava/lang/String;

    iput p2, p0, Li1/e;->b:F

    iput p3, p0, Li1/e;->c:F

    iput p4, p0, Li1/e;->d:I

    iput p5, p0, Li1/e;->e:I

    iput p6, p0, Li1/e;->f:F

    iput p7, p0, Li1/e;->g:F

    iput p8, p0, Li1/e;->h:I

    iput p9, p0, Li1/e;->i:F

    iput p10, p0, Li1/e;->j:I

    return-void
.end method

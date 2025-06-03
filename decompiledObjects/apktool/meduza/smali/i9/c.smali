.class public final Li9/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Lb0/d;

.field public static final d:Lr5/c;


# instance fields
.field public final a:Lj9/i;

.field public final b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lb0/d;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Lb0/d;-><init>(I)V

    sput-object v0, Li9/c;->c:Lb0/d;

    new-instance v0, Lr5/c;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lr5/c;-><init>(I)V

    sput-object v0, Li9/c;->d:Lr5/c;

    return-void
.end method

.method public constructor <init>(ILj9/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Li9/c;->a:Lj9/i;

    iput p1, p0, Li9/c;->b:I

    return-void
.end method

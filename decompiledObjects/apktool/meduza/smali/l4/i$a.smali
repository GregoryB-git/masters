.class public final Ll4/i$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll4/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Lc4/y$c;

.field public final b:Lc4/y$a;

.field public final c:[B

.field public final d:[Lc4/y$b;

.field public final e:I


# direct methods
.method public constructor <init>(Lc4/y$c;Lc4/y$a;[B[Lc4/y$b;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll4/i$a;->a:Lc4/y$c;

    iput-object p2, p0, Ll4/i$a;->b:Lc4/y$a;

    iput-object p3, p0, Ll4/i$a;->c:[B

    iput-object p4, p0, Ll4/i$a;->d:[Lc4/y$b;

    iput p5, p0, Ll4/i$a;->e:I

    return-void
.end method

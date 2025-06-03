.class public final Lk0/f0;
.super Ld0/f;
.source "SourceFile"

# interfaces
.implements Lk0/w;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk0/f0$d;,
        Lk0/f0$e;,
        Lk0/f0$c;,
        Lk0/f0$g;,
        Lk0/f0$b;,
        Lk0/f0$f;
    }
.end annotation


# instance fields
.field public final A:Lk0/b;

.field public final B:Lk0/m;

.field public final C:Lk0/g1;

.field public final D:Lk0/i1;

.field public final E:Lk0/j1;

.field public final F:J

.field public G:Landroid/media/AudioManager;

.field public final H:Z

.field public I:I

.field public J:Z

.field public K:I

.field public L:I

.field public M:Z

.field public N:Lk0/d1;

.field public O:Lx0/T;

.field public P:Lk0/w$c;

.field public Q:Z

.field public R:Ld0/D$b;

.field public S:Ld0/w;

.field public T:Ld0/w;

.field public U:Ld0/q;

.field public V:Ld0/q;

.field public W:Landroid/media/AudioTrack;

.field public X:Ljava/lang/Object;

.field public Y:Landroid/view/Surface;

.field public Z:Landroid/view/SurfaceHolder;

.field public a0:Z

.field public final b:LA0/E;

.field public b0:Landroid/view/TextureView;

.field public final c:Ld0/D$b;

.field public c0:I

.field public final d:Lg0/f;

.field public d0:I

.field public final e:Landroid/content/Context;

.field public e0:Lg0/A;

.field public final f:Ld0/D;

.field public f0:Lk0/o;

.field public final g:[Lk0/Y0;

.field public g0:Lk0/o;

.field public final h:LA0/D;

.field public h0:I

.field public final i:Lg0/k;

.field public i0:Ld0/b;

.field public final j:Lk0/t0$f;

.field public j0:F

.field public final k:Lk0/t0;

.field public k0:Z

.field public final l:Lg0/n;

.field public l0:Lf0/b;

.field public final m:Ljava/util/concurrent/CopyOnWriteArraySet;

.field public m0:Z

.field public final n:Ld0/I$b;

.field public n0:Z

.field public final o:Ljava/util/List;

.field public o0:I

.field public final p:Z

.field public p0:Z

.field public final q:Lx0/x$a;

.field public q0:Z

.field public final r:Ll0/a;

.field public r0:Ld0/l;

.field public final s:Landroid/os/Looper;

.field public s0:Ld0/P;

.field public final t:LB0/e;

.field public t0:Ld0/w;

.field public final u:J

.field public u0:Lk0/U0;

.field public final v:J

.field public v0:I

.field public final w:J

.field public w0:I

.field public final x:Lg0/c;

.field public x0:J

.field public final y:Lk0/f0$d;

.field public final z:Lk0/f0$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "media3.exoplayer"

    .line 2
    .line 3
    invoke-static {v0}, Ld0/v;->a(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>(Lk0/w$b;Ld0/D;)V
    .locals 42

    .line 1
    move-object/from16 v1, p0

    move-object/from16 v0, p1

    invoke-direct/range {p0 .. p0}, Ld0/f;-><init>()V

    new-instance v9, Lg0/f;

    invoke-direct {v9}, Lg0/f;-><init>()V

    iput-object v9, v1, Lk0/f0;->d:Lg0/f;

    :try_start_0
    const-string v10, "ExoPlayerImpl"

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "Init "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static/range {p0 .. p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v12

    invoke-static {v12}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v12, " ["

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v12, "AndroidXMedia3/1.4.1"

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v12, "] ["

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v12, Lg0/M;->e:Ljava/lang/String;

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v12, "]"

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Lg0/o;->f(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v10, v0, Lk0/w$b;->a:Landroid/content/Context;

    invoke-virtual {v10}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v10

    iput-object v10, v1, Lk0/f0;->e:Landroid/content/Context;

    iget-object v11, v0, Lk0/w$b;->i:LW2/g;

    iget-object v12, v0, Lk0/w$b;->b:Lg0/c;

    invoke-interface {v11, v12}, LW2/g;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll0/a;

    iput-object v11, v1, Lk0/f0;->r:Ll0/a;

    iget v12, v0, Lk0/w$b;->k:I

    iput v12, v1, Lk0/f0;->o0:I

    iget-object v12, v0, Lk0/w$b;->l:Ld0/b;

    iput-object v12, v1, Lk0/f0;->i0:Ld0/b;

    iget v12, v0, Lk0/w$b;->r:I

    iput v12, v1, Lk0/f0;->c0:I

    iget v12, v0, Lk0/w$b;->s:I

    iput v12, v1, Lk0/f0;->d0:I

    iget-boolean v12, v0, Lk0/w$b;->p:Z

    iput-boolean v12, v1, Lk0/f0;->k0:Z

    iget-wide v12, v0, Lk0/w$b;->A:J

    iput-wide v12, v1, Lk0/f0;->F:J

    new-instance v13, Lk0/f0$d;

    const/4 v12, 0x0

    invoke-direct {v13, v1, v12}, Lk0/f0$d;-><init>(Lk0/f0;Lk0/f0$a;)V

    iput-object v13, v1, Lk0/f0;->y:Lk0/f0$d;

    new-instance v15, Lk0/f0$e;

    invoke-direct {v15, v12}, Lk0/f0$e;-><init>(Lk0/f0$a;)V

    iput-object v15, v1, Lk0/f0;->z:Lk0/f0$e;

    new-instance v14, Landroid/os/Handler;

    iget-object v5, v0, Lk0/w$b;->j:Landroid/os/Looper;

    invoke-direct {v14, v5}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iget-object v5, v0, Lk0/w$b;->d:LW2/s;

    invoke-interface {v5}, LW2/s;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lk0/c1;

    move-object/from16 v33, v14

    move-object v14, v5

    move-object v5, v15

    move-object/from16 v15, v33

    move-object/from16 v16, v13

    move-object/from16 v17, v13

    move-object/from16 v18, v13

    move-object/from16 v19, v13

    invoke-interface/range {v14 .. v19}, Lk0/c1;->a(Landroid/os/Handler;LD0/E;Lm0/x;Lz0/h;Lu0/b;)[Lk0/Y0;

    move-result-object v14

    iput-object v14, v1, Lk0/f0;->g:[Lk0/Y0;

    array-length v15, v14

    const/4 v6, 0x0

    if-lez v15, :cond_0

    const/4 v15, 0x1

    goto :goto_0

    :cond_0
    move v15, v6

    :goto_0
    invoke-static {v15}, Lg0/a;->f(Z)V

    iget-object v15, v0, Lk0/w$b;->f:LW2/s;

    invoke-interface {v15}, LW2/s;->get()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, LA0/D;

    iput-object v15, v1, Lk0/f0;->h:LA0/D;

    iget-object v7, v0, Lk0/w$b;->e:LW2/s;

    invoke-interface {v7}, LW2/s;->get()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lx0/x$a;

    iput-object v7, v1, Lk0/f0;->q:Lx0/x$a;

    iget-object v7, v0, Lk0/w$b;->h:LW2/s;

    invoke-interface {v7}, LW2/s;->get()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LB0/e;

    iput-object v7, v1, Lk0/f0;->t:LB0/e;

    iget-boolean v8, v0, Lk0/w$b;->t:Z

    iput-boolean v8, v1, Lk0/f0;->p:Z

    iget-object v8, v0, Lk0/w$b;->u:Lk0/d1;

    iput-object v8, v1, Lk0/f0;->N:Lk0/d1;

    move-object/from16 v34, v5

    iget-wide v4, v0, Lk0/w$b;->v:J

    iput-wide v4, v1, Lk0/f0;->u:J

    iget-wide v4, v0, Lk0/w$b;->w:J

    iput-wide v4, v1, Lk0/f0;->v:J

    iget-wide v4, v0, Lk0/w$b;->x:J

    iput-wide v4, v1, Lk0/f0;->w:J

    iget-boolean v4, v0, Lk0/w$b;->B:Z

    iput-boolean v4, v1, Lk0/f0;->Q:Z

    iget-object v4, v0, Lk0/w$b;->j:Landroid/os/Looper;

    iput-object v4, v1, Lk0/f0;->s:Landroid/os/Looper;

    iget-object v5, v0, Lk0/w$b;->b:Lg0/c;

    iput-object v5, v1, Lk0/f0;->x:Lg0/c;

    if-nez p2, :cond_1

    move-object v8, v1

    goto :goto_1

    :cond_1
    move-object/from16 v8, p2

    :goto_1
    iput-object v8, v1, Lk0/f0;->f:Ld0/D;

    iget-boolean v2, v0, Lk0/w$b;->F:Z

    iput-boolean v2, v1, Lk0/f0;->H:Z

    new-instance v3, Lg0/n;

    new-instance v12, Lk0/O;

    invoke-direct {v12, v1}, Lk0/O;-><init>(Lk0/f0;)V

    invoke-direct {v3, v4, v5, v12}, Lg0/n;-><init>(Landroid/os/Looper;Lg0/c;Lg0/n$b;)V

    iput-object v3, v1, Lk0/f0;->l:Lg0/n;

    new-instance v3, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v3}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v3, v1, Lk0/f0;->m:Ljava/util/concurrent/CopyOnWriteArraySet;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, v1, Lk0/f0;->o:Ljava/util/List;

    new-instance v3, Lx0/T$a;

    invoke-direct {v3, v6}, Lx0/T$a;-><init>(I)V

    iput-object v3, v1, Lk0/f0;->O:Lx0/T;

    sget-object v3, Lk0/w$c;->b:Lk0/w$c;

    iput-object v3, v1, Lk0/f0;->P:Lk0/w$c;

    new-instance v3, LA0/E;

    array-length v12, v14

    new-array v12, v12, [Lk0/b1;

    array-length v6, v14

    new-array v6, v6, [LA0/y;

    move-object/from16 v19, v13

    sget-object v13, Ld0/L;->b:Ld0/L;

    move-object/from16 v35, v9

    const/4 v9, 0x0

    invoke-direct {v3, v12, v6, v13, v9}, LA0/E;-><init>([Lk0/b1;[LA0/y;Ld0/L;Ljava/lang/Object;)V

    iput-object v3, v1, Lk0/f0;->b:LA0/E;

    new-instance v6, Ld0/I$b;

    invoke-direct {v6}, Ld0/I$b;-><init>()V

    iput-object v6, v1, Lk0/f0;->n:Ld0/I$b;

    new-instance v6, Ld0/D$b$a;

    invoke-direct {v6}, Ld0/D$b$a;-><init>()V

    const/16 v9, 0x14

    new-array v9, v9, [I

    fill-array-data v9, :array_0

    invoke-virtual {v6, v9}, Ld0/D$b$a;->c([I)Ld0/D$b$a;

    move-result-object v6

    invoke-virtual {v15}, LA0/D;->h()Z

    move-result v9

    const/16 v12, 0x1d

    invoke-virtual {v6, v12, v9}, Ld0/D$b$a;->d(IZ)Ld0/D$b$a;

    move-result-object v6

    iget-boolean v9, v0, Lk0/w$b;->q:Z

    const/16 v13, 0x17

    invoke-virtual {v6, v13, v9}, Ld0/D$b$a;->d(IZ)Ld0/D$b$a;

    move-result-object v6

    iget-boolean v9, v0, Lk0/w$b;->q:Z

    const/16 v12, 0x19

    invoke-virtual {v6, v12, v9}, Ld0/D$b$a;->d(IZ)Ld0/D$b$a;

    move-result-object v6

    iget-boolean v9, v0, Lk0/w$b;->q:Z

    const/16 v12, 0x21

    invoke-virtual {v6, v12, v9}, Ld0/D$b$a;->d(IZ)Ld0/D$b$a;

    move-result-object v6

    iget-boolean v9, v0, Lk0/w$b;->q:Z

    const/16 v12, 0x1a

    invoke-virtual {v6, v12, v9}, Ld0/D$b$a;->d(IZ)Ld0/D$b$a;

    move-result-object v6

    iget-boolean v9, v0, Lk0/w$b;->q:Z

    const/16 v12, 0x22

    invoke-virtual {v6, v12, v9}, Ld0/D$b$a;->d(IZ)Ld0/D$b$a;

    move-result-object v6

    invoke-virtual {v6}, Ld0/D$b$a;->e()Ld0/D$b;

    move-result-object v6

    iput-object v6, v1, Lk0/f0;->c:Ld0/D$b;

    new-instance v9, Ld0/D$b$a;

    invoke-direct {v9}, Ld0/D$b$a;-><init>()V

    invoke-virtual {v9, v6}, Ld0/D$b$a;->b(Ld0/D$b;)Ld0/D$b$a;

    move-result-object v6

    const/4 v9, 0x4

    invoke-virtual {v6, v9}, Ld0/D$b$a;->a(I)Ld0/D$b$a;

    move-result-object v6

    const/16 v12, 0xa

    invoke-virtual {v6, v12}, Ld0/D$b$a;->a(I)Ld0/D$b$a;

    move-result-object v6

    invoke-virtual {v6}, Ld0/D$b$a;->e()Ld0/D$b;

    move-result-object v6

    iput-object v6, v1, Lk0/f0;->R:Ld0/D$b;

    const/4 v6, 0x0

    invoke-interface {v5, v4, v6}, Lg0/c;->e(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lg0/k;

    move-result-object v12

    iput-object v12, v1, Lk0/f0;->i:Lg0/k;

    new-instance v12, Lk0/Q;

    invoke-direct {v12, v1}, Lk0/Q;-><init>(Lk0/f0;)V

    iput-object v12, v1, Lk0/f0;->j:Lk0/t0$f;

    invoke-static {v3}, Lk0/U0;->k(LA0/E;)Lk0/U0;

    move-result-object v6

    iput-object v6, v1, Lk0/f0;->u0:Lk0/U0;

    invoke-interface {v11, v8, v4}, Ll0/a;->o0(Ld0/D;Landroid/os/Looper;)V

    sget v6, Lg0/M;->a:I

    const/16 v8, 0x1f

    if-ge v6, v8, :cond_2

    new-instance v8, Ll0/y1;

    iget-object v13, v0, Lk0/w$b;->G:Ljava/lang/String;

    invoke-direct {v8, v13}, Ll0/y1;-><init>(Ljava/lang/String;)V

    :goto_2
    move-object/from16 v30, v8

    goto :goto_3

    :catchall_0
    move-exception v0

    goto/16 :goto_b

    :cond_2
    iget-boolean v8, v0, Lk0/w$b;->C:Z

    iget-object v13, v0, Lk0/w$b;->G:Ljava/lang/String;

    invoke-static {v10, v1, v8, v13}, Lk0/f0$c;->a(Landroid/content/Context;Lk0/f0;ZLjava/lang/String;)Ll0/y1;

    move-result-object v8

    goto :goto_2

    :goto_3
    new-instance v8, Lk0/t0;

    iget-object v13, v0, Lk0/w$b;->g:LW2/s;

    invoke-interface {v13}, LW2/s;->get()Ljava/lang/Object;

    move-result-object v13

    move-object/from16 v17, v13

    check-cast v17, Lk0/x0;

    iget v13, v1, Lk0/f0;->I:I

    iget-boolean v9, v1, Lk0/f0;->J:Z

    move/from16 v36, v2

    iget-object v2, v1, Lk0/f0;->N:Lk0/d1;

    move-object/from16 v37, v10

    iget-object v10, v0, Lk0/w$b;->y:Lk0/w0;

    move-object/from16 v28, v5

    move/from16 v38, v6

    iget-wide v5, v0, Lk0/w$b;->z:J

    move-object/from16 v39, v4

    iget-boolean v4, v1, Lk0/f0;->Q:Z

    move/from16 v25, v4

    iget-boolean v4, v0, Lk0/w$b;->H:Z

    move/from16 v26, v4

    iget-object v4, v0, Lk0/w$b;->D:Landroid/os/Looper;

    iget-object v0, v1, Lk0/f0;->P:Lk0/w$c;

    move-object/from16 v29, v12

    move-object v12, v8

    move/from16 v18, v13

    move-object/from16 v40, v19

    move-object v13, v14

    move-object v14, v15

    move-object/from16 v41, v15

    move-object v15, v3

    move-object/from16 v16, v17

    move-object/from16 v17, v7

    move/from16 v19, v9

    move-object/from16 v20, v11

    move-object/from16 v21, v2

    move-object/from16 v22, v10

    move-wide/from16 v23, v5

    move-object/from16 v27, v39

    move-object/from16 v31, v4

    move-object/from16 v32, v0

    invoke-direct/range {v12 .. v32}, Lk0/t0;-><init>([Lk0/Y0;LA0/D;LA0/E;Lk0/x0;LB0/e;IZLl0/a;Lk0/d1;Lk0/w0;JZZLandroid/os/Looper;Lg0/c;Lk0/t0$f;Ll0/y1;Landroid/os/Looper;Lk0/w$c;)V

    iput-object v8, v1, Lk0/f0;->k:Lk0/t0;

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, v1, Lk0/f0;->j0:F

    const/4 v0, 0x0

    iput v0, v1, Lk0/f0;->I:I

    sget-object v0, Ld0/w;->H:Ld0/w;

    iput-object v0, v1, Lk0/f0;->S:Ld0/w;

    iput-object v0, v1, Lk0/f0;->T:Ld0/w;

    iput-object v0, v1, Lk0/f0;->t0:Ld0/w;

    const/4 v0, -0x1

    iput v0, v1, Lk0/f0;->v0:I

    move/from16 v0, v38

    const/16 v2, 0x15

    if-ge v0, v2, :cond_3

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lk0/f0;->x1(I)I

    move-result v3

    :goto_4
    iput v3, v1, Lk0/f0;->h0:I

    goto :goto_5

    :cond_3
    const/4 v2, 0x0

    invoke-static/range {v37 .. v37}, Lg0/M;->J(Landroid/content/Context;)I

    move-result v3

    goto :goto_4

    :goto_5
    sget-object v3, Lf0/b;->c:Lf0/b;

    iput-object v3, v1, Lk0/f0;->l0:Lf0/b;

    const/4 v3, 0x1

    iput-boolean v3, v1, Lk0/f0;->m0:Z

    invoke-virtual {v1, v11}, Lk0/f0;->v(Ld0/D$d;)V

    new-instance v3, Landroid/os/Handler;

    move-object/from16 v4, v39

    invoke-direct {v3, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-interface {v7, v3, v11}, LB0/e;->i(Landroid/os/Handler;LB0/e$a;)V

    move-object/from16 v3, v40

    invoke-virtual {v1, v3}, Lk0/f0;->d1(Lk0/w$a;)V

    move-object/from16 v5, p1

    iget-wide v6, v5, Lk0/w$b;->c:J

    const-wide/16 v9, 0x0

    cmp-long v9, v6, v9

    if-lez v9, :cond_4

    invoke-virtual {v8, v6, v7}, Lk0/t0;->B(J)V

    :cond_4
    new-instance v6, Lk0/b;

    iget-object v7, v5, Lk0/w$b;->a:Landroid/content/Context;

    move-object/from16 v8, v33

    invoke-direct {v6, v7, v8, v3}, Lk0/b;-><init>(Landroid/content/Context;Landroid/os/Handler;Lk0/b$b;)V

    iput-object v6, v1, Lk0/f0;->A:Lk0/b;

    iget-boolean v7, v5, Lk0/w$b;->o:Z

    invoke-virtual {v6, v7}, Lk0/b;->b(Z)V

    new-instance v6, Lk0/m;

    iget-object v7, v5, Lk0/w$b;->a:Landroid/content/Context;

    invoke-direct {v6, v7, v8, v3}, Lk0/m;-><init>(Landroid/content/Context;Landroid/os/Handler;Lk0/m$b;)V

    iput-object v6, v1, Lk0/f0;->B:Lk0/m;

    iget-boolean v7, v5, Lk0/w$b;->m:Z

    if-eqz v7, :cond_5

    iget-object v12, v1, Lk0/f0;->i0:Ld0/b;

    goto :goto_6

    :cond_5
    const/4 v12, 0x0

    :goto_6
    invoke-virtual {v6, v12}, Lk0/m;->m(Ld0/b;)V

    if-eqz v36, :cond_6

    const/16 v6, 0x17

    if-lt v0, v6, :cond_6

    const-string v0, "audio"

    move-object/from16 v6, v37

    invoke-virtual {v6, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/AudioManager;

    iput-object v0, v1, Lk0/f0;->G:Landroid/media/AudioManager;

    new-instance v6, Lk0/f0$g;

    const/4 v7, 0x0

    invoke-direct {v6, v1, v7}, Lk0/f0$g;-><init>(Lk0/f0;Lk0/f0$a;)V

    new-instance v9, Landroid/os/Handler;

    invoke-direct {v9, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-static {v0, v6, v9}, Lk0/f0$b;->b(Landroid/media/AudioManager;Landroid/media/AudioDeviceCallback;Landroid/os/Handler;)V

    goto :goto_7

    :cond_6
    const/4 v7, 0x0

    :goto_7
    iget-boolean v0, v5, Lk0/w$b;->q:Z

    if-eqz v0, :cond_7

    new-instance v0, Lk0/g1;

    iget-object v4, v5, Lk0/w$b;->a:Landroid/content/Context;

    invoke-direct {v0, v4, v8, v3}, Lk0/g1;-><init>(Landroid/content/Context;Landroid/os/Handler;Lk0/g1$b;)V

    iput-object v0, v1, Lk0/f0;->C:Lk0/g1;

    iget-object v3, v1, Lk0/f0;->i0:Ld0/b;

    iget v3, v3, Ld0/b;->c:I

    invoke-static {v3}, Lg0/M;->k0(I)I

    move-result v3

    invoke-virtual {v0, v3}, Lk0/g1;->h(I)V

    goto :goto_8

    :cond_7
    iput-object v7, v1, Lk0/f0;->C:Lk0/g1;

    :goto_8
    new-instance v0, Lk0/i1;

    iget-object v3, v5, Lk0/w$b;->a:Landroid/content/Context;

    invoke-direct {v0, v3}, Lk0/i1;-><init>(Landroid/content/Context;)V

    iput-object v0, v1, Lk0/f0;->D:Lk0/i1;

    iget v3, v5, Lk0/w$b;->n:I

    if-eqz v3, :cond_8

    const/4 v3, 0x1

    goto :goto_9

    :cond_8
    move v3, v2

    :goto_9
    invoke-virtual {v0, v3}, Lk0/i1;->a(Z)V

    new-instance v0, Lk0/j1;

    iget-object v3, v5, Lk0/w$b;->a:Landroid/content/Context;

    invoke-direct {v0, v3}, Lk0/j1;-><init>(Landroid/content/Context;)V

    iput-object v0, v1, Lk0/f0;->E:Lk0/j1;

    iget v3, v5, Lk0/w$b;->n:I

    const/4 v4, 0x2

    if-ne v3, v4, :cond_9

    const/4 v6, 0x1

    goto :goto_a

    :cond_9
    move v6, v2

    :goto_a
    invoke-virtual {v0, v6}, Lk0/j1;->a(Z)V

    iget-object v0, v1, Lk0/f0;->C:Lk0/g1;

    invoke-static {v0}, Lk0/f0;->h1(Lk0/g1;)Ld0/l;

    move-result-object v0

    iput-object v0, v1, Lk0/f0;->r0:Ld0/l;

    sget-object v0, Ld0/P;->e:Ld0/P;

    iput-object v0, v1, Lk0/f0;->s0:Ld0/P;

    sget-object v0, Lg0/A;->c:Lg0/A;

    iput-object v0, v1, Lk0/f0;->e0:Lg0/A;

    iget-object v0, v1, Lk0/f0;->i0:Ld0/b;

    move-object/from16 v15, v41

    invoke-virtual {v15, v0}, LA0/D;->l(Ld0/b;)V

    iget v0, v1, Lk0/f0;->h0:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/16 v2, 0xa

    const/4 v3, 0x1

    invoke-virtual {v1, v3, v2, v0}, Lk0/f0;->f2(IILjava/lang/Object;)V

    iget v0, v1, Lk0/f0;->h0:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v4, 0x2

    invoke-virtual {v1, v4, v2, v0}, Lk0/f0;->f2(IILjava/lang/Object;)V

    iget-object v0, v1, Lk0/f0;->i0:Ld0/b;

    const/4 v2, 0x3

    invoke-virtual {v1, v3, v2, v0}, Lk0/f0;->f2(IILjava/lang/Object;)V

    iget v0, v1, Lk0/f0;->c0:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v2, 0x4

    invoke-virtual {v1, v4, v2, v0}, Lk0/f0;->f2(IILjava/lang/Object;)V

    iget v0, v1, Lk0/f0;->d0:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v2, 0x5

    invoke-virtual {v1, v4, v2, v0}, Lk0/f0;->f2(IILjava/lang/Object;)V

    iget-boolean v0, v1, Lk0/f0;->k0:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const/16 v2, 0x9

    const/4 v3, 0x1

    invoke-virtual {v1, v3, v2, v0}, Lk0/f0;->f2(IILjava/lang/Object;)V

    const/4 v0, 0x7

    move-object/from16 v2, v34

    invoke-virtual {v1, v4, v0, v2}, Lk0/f0;->f2(IILjava/lang/Object;)V

    const/4 v0, 0x6

    const/16 v3, 0x8

    invoke-virtual {v1, v0, v3, v2}, Lk0/f0;->f2(IILjava/lang/Object;)V

    iget v0, v1, Lk0/f0;->o0:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/16 v2, 0x10

    invoke-virtual {v1, v2, v0}, Lk0/f0;->g2(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual/range {v35 .. v35}, Lg0/f;->e()Z

    return-void

    :goto_b
    iget-object v2, v1, Lk0/f0;->d:Lg0/f;

    invoke-virtual {v2}, Lg0/f;->e()Z

    throw v0

    nop

    :array_0
    .array-data 4
        0x1
        0x2
        0x3
        0xd
        0xe
        0xf
        0x10
        0x11
        0x12
        0x13
        0x1f
        0x14
        0x1e
        0x15
        0x23
        0x16
        0x18
        0x1b
        0x1c
        0x20
    .end array-data
.end method

.method public static synthetic A0(Lk0/f0;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lk0/f0;->k0:Z

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic B0(Lk0/f0;Lf0/b;)Lf0/b;
    .locals 0

    .line 1
    iput-object p1, p0, Lk0/f0;->l0:Lf0/b;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic C0(Lk0/f0;)Ld0/w;
    .locals 0

    .line 1
    iget-object p0, p0, Lk0/f0;->t0:Ld0/w;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic D0(Lk0/f0;Ld0/w;)Ld0/w;
    .locals 0

    .line 1
    iput-object p1, p0, Lk0/f0;->t0:Ld0/w;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic D1(Ld0/D$d;)V
    .locals 2

    .line 1
    new-instance v0, Lk0/u0;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lk0/u0;-><init>(I)V

    .line 5
    .line 6
    .line 7
    const/16 v1, 0x3eb

    .line 8
    .line 9
    invoke-static {v0, v1}, Lk0/u;->d(Ljava/lang/RuntimeException;I)Lk0/u;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {p0, v0}, Ld0/D$d;->e0(Ld0/B;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public static synthetic E0(Lk0/f0;)Ld0/w;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lk0/f0;->f1()Ld0/w;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic E1(Ld0/b;Ld0/D$d;)V
    .locals 0

    .line 1
    invoke-interface {p1, p0}, Ld0/D$d;->F(Ld0/b;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic F0(Lk0/f0;)Ld0/w;
    .locals 0

    .line 1
    iget-object p0, p0, Lk0/f0;->S:Ld0/w;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic F1(ILd0/D$d;)V
    .locals 0

    .line 1
    invoke-interface {p1, p0}, Ld0/D$d;->m(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic G0(Lk0/f0;Ld0/w;)Ld0/w;
    .locals 0

    .line 1
    iput-object p1, p0, Lk0/f0;->S:Ld0/w;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic G1(ZLd0/D$d;)V
    .locals 0

    .line 1
    invoke-interface {p1, p0}, Ld0/D$d;->h0(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic H0(Lk0/f0;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lk0/f0;->a0:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic H1(ZLd0/D$d;)V
    .locals 0

    .line 1
    invoke-interface {p1, p0}, Ld0/D$d;->c(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic I0(Lk0/f0;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lk0/f0;->m2(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic I1(Ld0/K;Ld0/D$d;)V
    .locals 0

    .line 1
    invoke-interface {p1, p0}, Ld0/D$d;->D(Ld0/K;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic J0(Lk0/f0;II)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lk0/f0;->b2(II)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic J1(FLd0/D$d;)V
    .locals 0

    .line 1
    invoke-interface {p1, p0}, Ld0/D$d;->U(F)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic K0(Lk0/f0;Landroid/graphics/SurfaceTexture;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lk0/f0;->l2(Landroid/graphics/SurfaceTexture;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic L0(Lk0/f0;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lk0/f0;->h2()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic L1(Lk0/U0;ILd0/D$d;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lk0/U0;->a:Ld0/I;

    .line 2
    .line 3
    invoke-interface {p2, p0, p1}, Ld0/D$d;->P(Ld0/I;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic M0(I)I
    .locals 0

    .line 1
    invoke-static {p0}, Lk0/f0;->q1(I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic M1(ILd0/D$e;Ld0/D$e;Ld0/D$d;)V
    .locals 0

    .line 1
    invoke-interface {p3, p0}, Ld0/D$d;->H(I)V

    .line 2
    .line 3
    .line 4
    invoke-interface {p3, p1, p2, p0}, Ld0/D$d;->k0(Ld0/D$e;Ld0/D$e;I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public static synthetic N0(Lk0/f0;ZII)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lk0/f0;->p2(ZII)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic N1(Ld0/u;ILd0/D$d;)V
    .locals 0

    .line 1
    invoke-interface {p2, p0, p1}, Ld0/D$d;->O(Ld0/u;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic O0(Lk0/f0;)Lk0/g1;
    .locals 0

    .line 1
    iget-object p0, p0, Lk0/f0;->C:Lk0/g1;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic O1(Lk0/U0;Ld0/D$d;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lk0/U0;->f:Lk0/u;

    .line 2
    .line 3
    invoke-interface {p1, p0}, Ld0/D$d;->E(Ld0/B;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic P0(Lk0/g1;)Ld0/l;
    .locals 0

    .line 1
    invoke-static {p0}, Lk0/f0;->h1(Lk0/g1;)Ld0/l;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic P1(Lk0/U0;Ld0/D$d;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lk0/U0;->f:Lk0/u;

    .line 2
    .line 3
    invoke-interface {p1, p0}, Ld0/D$d;->e0(Ld0/B;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic Q0(Lk0/f0;)Ld0/l;
    .locals 0

    .line 1
    iget-object p0, p0, Lk0/f0;->r0:Ld0/l;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic Q1(Lk0/U0;Ld0/D$d;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lk0/U0;->i:LA0/E;

    .line 2
    .line 3
    iget-object p0, p0, LA0/E;->d:Ld0/L;

    .line 4
    .line 5
    invoke-interface {p1, p0}, Ld0/D$d;->J(Ld0/L;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static synthetic R0(Lk0/f0;Ld0/l;)Ld0/l;
    .locals 0

    .line 1
    iput-object p1, p0, Lk0/f0;->r0:Ld0/l;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic R1(Ld0/w;Ld0/D$d;)V
    .locals 0

    .line 1
    invoke-interface {p1, p0}, Ld0/D$d;->I(Ld0/w;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic S0(Lk0/f0;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lk0/f0;->t2()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic S1(Lk0/U0;Ld0/D$d;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lk0/U0;->g:Z

    .line 2
    .line 3
    invoke-interface {p1, v0}, Ld0/D$d;->G(Z)V

    .line 4
    .line 5
    .line 6
    iget-boolean p0, p0, Lk0/U0;->g:Z

    .line 7
    .line 8
    invoke-interface {p1, p0}, Ld0/D$d;->Q(Z)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static synthetic T0(Lk0/f0;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lk0/f0;->w1()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic T1(Lk0/U0;Ld0/D$d;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lk0/U0;->l:Z

    .line 2
    .line 3
    iget p0, p0, Lk0/U0;->e:I

    .line 4
    .line 5
    invoke-interface {p1, v0, p0}, Ld0/D$d;->C(ZI)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static synthetic U0(Lk0/f0;)Lk0/U0;
    .locals 0

    .line 1
    iget-object p0, p0, Lk0/f0;->u0:Lk0/U0;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic U1(Lk0/U0;Ld0/D$d;)V
    .locals 0

    .line 1
    iget p0, p0, Lk0/U0;->e:I

    .line 2
    .line 3
    invoke-interface {p1, p0}, Ld0/D$d;->X(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic V0(Lk0/f0;ZII)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lk0/f0;->r2(ZII)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic V1(Lk0/U0;Ld0/D$d;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lk0/U0;->l:Z

    .line 2
    .line 3
    iget p0, p0, Lk0/U0;->m:I

    .line 4
    .line 5
    invoke-interface {p1, v0, p0}, Ld0/D$d;->Y(ZI)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static synthetic W0(Lk0/f0;Lk0/o;)Lk0/o;
    .locals 0

    .line 1
    iput-object p1, p0, Lk0/f0;->f0:Lk0/o;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic W1(Lk0/U0;Ld0/D$d;)V
    .locals 0

    .line 1
    iget p0, p0, Lk0/U0;->n:I

    .line 2
    .line 3
    invoke-interface {p1, p0}, Ld0/D$d;->B(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic X(Lk0/U0;Ld0/D$d;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lk0/f0;->U1(Lk0/U0;Ld0/D$d;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic X0(Lk0/f0;)Ll0/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lk0/f0;->r:Ll0/a;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic X1(Lk0/U0;Ld0/D$d;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lk0/U0;->n()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-interface {p1, p0}, Ld0/D$d;->r0(Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static synthetic Y(Lk0/f0;Ld0/D$d;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lk0/f0;->K1(Ld0/D$d;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic Y0(Lk0/f0;Ld0/q;)Ld0/q;
    .locals 0

    .line 1
    iput-object p1, p0, Lk0/f0;->U:Ld0/q;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic Y1(Lk0/U0;Ld0/D$d;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lk0/U0;->o:Ld0/C;

    .line 2
    .line 3
    invoke-interface {p1, p0}, Ld0/D$d;->j(Ld0/C;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic Z(ILd0/D$d;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lk0/f0;->F1(ILd0/D$d;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic Z0(Lk0/f0;Ld0/P;)Ld0/P;
    .locals 0

    .line 1
    iput-object p1, p0, Lk0/f0;->s0:Ld0/P;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic a0(Lk0/U0;Ld0/D$d;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lk0/f0;->Y1(Lk0/U0;Ld0/D$d;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic a1(Lk0/f0;)Lg0/n;
    .locals 0

    .line 1
    iget-object p0, p0, Lk0/f0;->l:Lg0/n;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic b0(Lk0/U0;Ld0/D$d;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lk0/f0;->W1(Lk0/U0;Ld0/D$d;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b1(Lk0/f0;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lk0/f0;->X:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic c0(ILd0/D$e;Ld0/D$e;Ld0/D$d;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lk0/f0;->M1(ILd0/D$e;Ld0/D$e;Ld0/D$d;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic d0(ZLd0/D$d;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lk0/f0;->H1(ZLd0/D$d;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic e0(ZLd0/D$d;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lk0/f0;->G1(ZLd0/D$d;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic f0(Lk0/f0;Ld0/D$d;Ld0/p;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lk0/f0;->A1(Ld0/D$d;Ld0/p;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic g0(Lk0/U0;Ld0/D$d;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lk0/f0;->P1(Lk0/U0;Ld0/D$d;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic h0(Lk0/U0;Ld0/D$d;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lk0/f0;->O1(Lk0/U0;Ld0/D$d;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static h1(Lk0/g1;)Ld0/l;
    .locals 3

    .line 1
    new-instance v0, Ld0/l$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ld0/l$b;-><init>(I)V

    .line 5
    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lk0/g1;->d()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v2, v1

    .line 15
    :goto_0
    invoke-virtual {v0, v2}, Ld0/l$b;->g(I)Ld0/l$b;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz p0, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0}, Lk0/g1;->c()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    :cond_1
    invoke-virtual {v0, v1}, Ld0/l$b;->f(I)Ld0/l$b;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p0}, Ld0/l$b;->e()Ld0/l;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0
.end method

.method public static synthetic i0(FLd0/D$d;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lk0/f0;->J1(FLd0/D$d;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic j0(IILd0/D$d;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lk0/f0;->z1(IILd0/D$d;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic k0(Lk0/U0;Ld0/D$d;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lk0/f0;->V1(Lk0/U0;Ld0/D$d;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic l0(Lk0/U0;Ld0/D$d;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lk0/f0;->S1(Lk0/U0;Ld0/D$d;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic m0(Ld0/u;ILd0/D$d;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lk0/f0;->N1(Ld0/u;ILd0/D$d;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic n0(Ld0/b;Ld0/D$d;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lk0/f0;->E1(Ld0/b;Ld0/D$d;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic o0(Ld0/w;Ld0/D$d;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lk0/f0;->R1(Ld0/w;Ld0/D$d;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic p0(Lk0/U0;Ld0/D$d;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lk0/f0;->X1(Lk0/U0;Ld0/D$d;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic q0(Ld0/K;Ld0/D$d;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lk0/f0;->I1(Ld0/K;Ld0/D$d;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static q1(I)I
    .locals 1

    .line 1
    const/4 v0, -0x1

    .line 2
    if-ne p0, v0, :cond_0

    .line 3
    .line 4
    const/4 p0, 0x2

    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/4 p0, 0x1

    .line 7
    :goto_0
    return p0
.end method

.method public static synthetic r0(Lk0/f0;Lk0/t0$e;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lk0/f0;->B1(Lk0/t0$e;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic s0(Lk0/U0;ILd0/D$d;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lk0/f0;->L1(Lk0/U0;ILd0/D$d;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic t0(Lk0/f0;Lk0/t0$e;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lk0/f0;->C1(Lk0/t0$e;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic u0(Ld0/D$d;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lk0/f0;->D1(Ld0/D$d;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static u1(Lk0/U0;)J
    .locals 6

    .line 1
    new-instance v0, Ld0/I$c;

    .line 2
    .line 3
    invoke-direct {v0}, Ld0/I$c;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ld0/I$b;

    .line 7
    .line 8
    invoke-direct {v1}, Ld0/I$b;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v2, p0, Lk0/U0;->a:Ld0/I;

    .line 12
    .line 13
    iget-object v3, p0, Lk0/U0;->b:Lx0/x$b;

    .line 14
    .line 15
    iget-object v3, v3, Lx0/x$b;->a:Ljava/lang/Object;

    .line 16
    .line 17
    invoke-virtual {v2, v3, v1}, Ld0/I;->h(Ljava/lang/Object;Ld0/I$b;)Ld0/I$b;

    .line 18
    .line 19
    .line 20
    iget-wide v2, p0, Lk0/U0;->c:J

    .line 21
    .line 22
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    cmp-long v2, v2, v4

    .line 28
    .line 29
    if-nez v2, :cond_0

    .line 30
    .line 31
    iget-object p0, p0, Lk0/U0;->a:Ld0/I;

    .line 32
    .line 33
    iget v1, v1, Ld0/I$b;->c:I

    .line 34
    .line 35
    invoke-virtual {p0, v1, v0}, Ld0/I;->n(ILd0/I$c;)Ld0/I$c;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {p0}, Ld0/I$c;->c()J

    .line 40
    .line 41
    .line 42
    move-result-wide v0

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    invoke-virtual {v1}, Ld0/I$b;->n()J

    .line 45
    .line 46
    .line 47
    move-result-wide v0

    .line 48
    iget-wide v2, p0, Lk0/U0;->c:J

    .line 49
    .line 50
    add-long/2addr v0, v2

    .line 51
    :goto_0
    return-wide v0
.end method

.method public static synthetic v0(Lk0/U0;Ld0/D$d;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lk0/f0;->T1(Lk0/U0;Ld0/D$d;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic w0(Lk0/U0;Ld0/D$d;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lk0/f0;->Q1(Lk0/U0;Ld0/D$d;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic x0(Lk0/f0;Lk0/o;)Lk0/o;
    .locals 0

    .line 1
    iput-object p1, p0, Lk0/f0;->g0:Lk0/o;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic y0(Lk0/f0;Ld0/q;)Ld0/q;
    .locals 0

    .line 1
    iput-object p1, p0, Lk0/f0;->V:Ld0/q;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic z0(Lk0/f0;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lk0/f0;->k0:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic z1(IILd0/D$d;)V
    .locals 0

    .line 1
    invoke-interface {p2, p0, p1}, Ld0/D$d;->i0(II)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public A(Ld0/b;Z)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lk0/f0;->u2()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lk0/f0;->q0:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object v0, p0, Lk0/f0;->i0:Ld0/b;

    .line 10
    .line 11
    invoke-static {v0, p1}, Lg0/M;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_2

    .line 16
    .line 17
    iput-object p1, p0, Lk0/f0;->i0:Ld0/b;

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    const/4 v1, 0x3

    .line 21
    invoke-virtual {p0, v0, v1, p1}, Lk0/f0;->f2(IILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lk0/f0;->C:Lk0/g1;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    iget v1, p1, Ld0/b;->c:I

    .line 29
    .line 30
    invoke-static {v1}, Lg0/M;->k0(I)I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    invoke-virtual {v0, v1}, Lk0/g1;->h(I)V

    .line 35
    .line 36
    .line 37
    :cond_1
    iget-object v0, p0, Lk0/f0;->l:Lg0/n;

    .line 38
    .line 39
    new-instance v1, Lk0/S;

    .line 40
    .line 41
    invoke-direct {v1, p1}, Lk0/S;-><init>(Ld0/b;)V

    .line 42
    .line 43
    .line 44
    const/16 v2, 0x14

    .line 45
    .line 46
    invoke-virtual {v0, v2, v1}, Lg0/n;->i(ILg0/n$a;)V

    .line 47
    .line 48
    .line 49
    :cond_2
    iget-object v0, p0, Lk0/f0;->B:Lk0/m;

    .line 50
    .line 51
    if-eqz p2, :cond_3

    .line 52
    .line 53
    move-object p2, p1

    .line 54
    goto :goto_0

    .line 55
    :cond_3
    const/4 p2, 0x0

    .line 56
    :goto_0
    invoke-virtual {v0, p2}, Lk0/m;->m(Ld0/b;)V

    .line 57
    .line 58
    .line 59
    iget-object p2, p0, Lk0/f0;->h:LA0/D;

    .line 60
    .line 61
    invoke-virtual {p2, p1}, LA0/D;->l(Ld0/b;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, Lk0/f0;->u()Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    iget-object p2, p0, Lk0/f0;->B:Lk0/m;

    .line 69
    .line 70
    invoke-virtual {p0}, Lk0/f0;->f()I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    invoke-virtual {p2, p1, v0}, Lk0/m;->p(ZI)I

    .line 75
    .line 76
    .line 77
    move-result p2

    .line 78
    invoke-static {p2}, Lk0/f0;->q1(I)I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    invoke-virtual {p0, p1, p2, v0}, Lk0/f0;->p2(ZII)V

    .line 83
    .line 84
    .line 85
    iget-object p1, p0, Lk0/f0;->l:Lg0/n;

    .line 86
    .line 87
    invoke-virtual {p1}, Lg0/n;->f()V

    .line 88
    .line 89
    .line 90
    return-void
.end method

.method public final synthetic A1(Ld0/D$d;Ld0/p;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lk0/f0;->f:Ld0/D;

    .line 2
    .line 3
    new-instance v1, Ld0/D$c;

    .line 4
    .line 5
    invoke-direct {v1, p2}, Ld0/D$c;-><init>(Ld0/p;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p1, v0, v1}, Ld0/D$d;->n0(Ld0/D;Ld0/D$c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final synthetic B1(Lk0/t0$e;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lk0/f0;->v1(Lk0/t0$e;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public C()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Lk0/f0;->u2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lk0/f0;->u0:Lk0/U0;

    .line 5
    .line 6
    iget-object v0, v0, Lk0/U0;->a:Ld0/I;

    .line 7
    .line 8
    invoke-virtual {v0}, Ld0/I;->q()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget v0, p0, Lk0/f0;->w0:I

    .line 15
    .line 16
    return v0

    .line 17
    :cond_0
    iget-object v0, p0, Lk0/f0;->u0:Lk0/U0;

    .line 18
    .line 19
    iget-object v1, v0, Lk0/U0;->a:Ld0/I;

    .line 20
    .line 21
    iget-object v0, v0, Lk0/U0;->b:Lx0/x$b;

    .line 22
    .line 23
    iget-object v0, v0, Lx0/x$b;->a:Ljava/lang/Object;

    .line 24
    .line 25
    invoke-virtual {v1, v0}, Ld0/I;->b(Ljava/lang/Object;)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    return v0
.end method

.method public final synthetic C1(Lk0/t0$e;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lk0/f0;->i:Lg0/k;

    .line 2
    .line 3
    new-instance v1, Lk0/V;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Lk0/V;-><init>(Lk0/f0;Lk0/t0$e;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1}, Lg0/k;->j(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public D()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lk0/f0;->u2()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lk0/f0;->o()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lk0/f0;->u0:Lk0/U0;

    .line 11
    .line 12
    iget-object v0, v0, Lk0/U0;->b:Lx0/x$b;

    .line 13
    .line 14
    iget v0, v0, Lx0/x$b;->b:I

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, -0x1

    .line 18
    :goto_0
    return v0
.end method

.method public E()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Lk0/f0;->u2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lk0/f0;->u0:Lk0/U0;

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lk0/f0;->p1(Lk0/U0;)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, -0x1

    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    :cond_0
    return v0
.end method

.method public F(Ld0/K;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lk0/f0;->u2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lk0/f0;->h:LA0/D;

    .line 5
    .line 6
    invoke-virtual {v0}, LA0/D;->h()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Lk0/f0;->h:LA0/D;

    .line 13
    .line 14
    invoke-virtual {v0}, LA0/D;->c()Ld0/K;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p1, v0}, Ld0/K;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object v0, p0, Lk0/f0;->h:LA0/D;

    .line 26
    .line 27
    invoke-virtual {v0, p1}, LA0/D;->m(Ld0/K;)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lk0/f0;->l:Lg0/n;

    .line 31
    .line 32
    new-instance v1, Lk0/T;

    .line 33
    .line 34
    invoke-direct {v1, p1}, Lk0/T;-><init>(Ld0/K;)V

    .line 35
    .line 36
    .line 37
    const/16 p1, 0x13

    .line 38
    .line 39
    invoke-virtual {v0, p1, v1}, Lg0/n;->k(ILg0/n$a;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    :goto_0
    return-void
.end method

.method public H()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lk0/f0;->u2()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lk0/f0;->o()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lk0/f0;->u0:Lk0/U0;

    .line 11
    .line 12
    iget-object v0, v0, Lk0/U0;->b:Lx0/x$b;

    .line 13
    .line 14
    iget v0, v0, Lx0/x$b;->c:I

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, -0x1

    .line 18
    :goto_0
    return v0
.end method

.method public J()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lk0/f0;->u2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lk0/f0;->u0:Lk0/U0;

    .line 5
    .line 6
    iget v0, v0, Lk0/U0;->n:I

    .line 7
    .line 8
    return v0
.end method

.method public K()J
    .locals 4

    .line 1
    invoke-virtual {p0}, Lk0/f0;->u2()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lk0/f0;->o()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lk0/f0;->u0:Lk0/U0;

    .line 11
    .line 12
    iget-object v1, v0, Lk0/U0;->b:Lx0/x$b;

    .line 13
    .line 14
    iget-object v0, v0, Lk0/U0;->a:Ld0/I;

    .line 15
    .line 16
    iget-object v2, v1, Lx0/x$b;->a:Ljava/lang/Object;

    .line 17
    .line 18
    iget-object v3, p0, Lk0/f0;->n:Ld0/I$b;

    .line 19
    .line 20
    invoke-virtual {v0, v2, v3}, Ld0/I;->h(Ljava/lang/Object;Ld0/I$b;)Ld0/I$b;

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lk0/f0;->n:Ld0/I$b;

    .line 24
    .line 25
    iget v2, v1, Lx0/x$b;->b:I

    .line 26
    .line 27
    iget v1, v1, Lx0/x$b;->c:I

    .line 28
    .line 29
    invoke-virtual {v0, v2, v1}, Ld0/I$b;->b(II)J

    .line 30
    .line 31
    .line 32
    move-result-wide v0

    .line 33
    invoke-static {v0, v1}, Lg0/M;->i1(J)J

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    return-wide v0

    .line 38
    :cond_0
    invoke-virtual {p0}, Ld0/f;->a()J

    .line 39
    .line 40
    .line 41
    move-result-wide v0

    .line 42
    return-wide v0
.end method

.method public final synthetic K1(Ld0/D$d;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lk0/f0;->R:Ld0/D$b;

    .line 2
    .line 3
    invoke-interface {p1, v0}, Ld0/D$d;->j0(Ld0/D$b;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public L()Ld0/I;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lk0/f0;->u2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lk0/f0;->u0:Lk0/U0;

    .line 5
    .line 6
    iget-object v0, v0, Lk0/U0;->a:Ld0/I;

    .line 7
    .line 8
    return-object v0
.end method

.method public N()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lk0/f0;->u2()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lk0/f0;->J:Z

    .line 5
    .line 6
    return v0
.end method

.method public O()Ld0/K;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lk0/f0;->u2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lk0/f0;->h:LA0/D;

    .line 5
    .line 6
    invoke-virtual {v0}, LA0/D;->c()Ld0/K;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0
.end method

.method public P()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lk0/f0;->u2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lk0/f0;->u0:Lk0/U0;

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lk0/f0;->o1(Lk0/U0;)J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    invoke-static {v0, v1}, Lg0/M;->i1(J)J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    return-wide v0
.end method

.method public U(IJIZ)V
    .locals 10

    .line 1
    invoke-virtual {p0}, Lk0/f0;->u2()V

    .line 2
    .line 3
    .line 4
    const/4 p4, -0x1

    .line 5
    if-ne p1, p4, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const/4 p4, 0x1

    .line 9
    if-ltz p1, :cond_1

    .line 10
    .line 11
    move v0, p4

    .line 12
    goto :goto_0

    .line 13
    :cond_1
    const/4 v0, 0x0

    .line 14
    :goto_0
    invoke-static {v0}, Lg0/a;->a(Z)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lk0/f0;->u0:Lk0/U0;

    .line 18
    .line 19
    iget-object v0, v0, Lk0/U0;->a:Ld0/I;

    .line 20
    .line 21
    invoke-virtual {v0}, Ld0/I;->q()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_2

    .line 26
    .line 27
    invoke-virtual {v0}, Ld0/I;->p()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-lt p1, v1, :cond_2

    .line 32
    .line 33
    return-void

    .line 34
    :cond_2
    iget-object v1, p0, Lk0/f0;->r:Ll0/a;

    .line 35
    .line 36
    invoke-interface {v1}, Ll0/a;->f0()V

    .line 37
    .line 38
    .line 39
    iget v1, p0, Lk0/f0;->K:I

    .line 40
    .line 41
    add-int/2addr v1, p4

    .line 42
    iput v1, p0, Lk0/f0;->K:I

    .line 43
    .line 44
    invoke-virtual {p0}, Lk0/f0;->o()Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_3

    .line 49
    .line 50
    const-string p1, "ExoPlayerImpl"

    .line 51
    .line 52
    const-string p2, "seekTo ignored because an ad is playing"

    .line 53
    .line 54
    invoke-static {p1, p2}, Lg0/o;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    new-instance p1, Lk0/t0$e;

    .line 58
    .line 59
    iget-object p2, p0, Lk0/f0;->u0:Lk0/U0;

    .line 60
    .line 61
    invoke-direct {p1, p2}, Lk0/t0$e;-><init>(Lk0/U0;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, p4}, Lk0/t0$e;->b(I)V

    .line 65
    .line 66
    .line 67
    iget-object p2, p0, Lk0/f0;->j:Lk0/t0$f;

    .line 68
    .line 69
    invoke-interface {p2, p1}, Lk0/t0$f;->a(Lk0/t0$e;)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_3
    iget-object p4, p0, Lk0/f0;->u0:Lk0/U0;

    .line 74
    .line 75
    iget v1, p4, Lk0/U0;->e:I

    .line 76
    .line 77
    const/4 v2, 0x3

    .line 78
    if-eq v1, v2, :cond_4

    .line 79
    .line 80
    const/4 v2, 0x4

    .line 81
    if-ne v1, v2, :cond_5

    .line 82
    .line 83
    invoke-virtual {v0}, Ld0/I;->q()Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-nez v1, :cond_5

    .line 88
    .line 89
    :cond_4
    iget-object p4, p0, Lk0/f0;->u0:Lk0/U0;

    .line 90
    .line 91
    const/4 v1, 0x2

    .line 92
    invoke-virtual {p4, v1}, Lk0/U0;->h(I)Lk0/U0;

    .line 93
    .line 94
    .line 95
    move-result-object p4

    .line 96
    :cond_5
    invoke-virtual {p0}, Lk0/f0;->E()I

    .line 97
    .line 98
    .line 99
    move-result v8

    .line 100
    invoke-virtual {p0, v0, p1, p2, p3}, Lk0/f0;->a2(Ld0/I;IJ)Landroid/util/Pair;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-virtual {p0, p4, v0, v1}, Lk0/f0;->Z1(Lk0/U0;Ld0/I;Landroid/util/Pair;)Lk0/U0;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    iget-object p4, p0, Lk0/f0;->k:Lk0/t0;

    .line 109
    .line 110
    invoke-static {p2, p3}, Lg0/M;->J0(J)J

    .line 111
    .line 112
    .line 113
    move-result-wide p2

    .line 114
    invoke-virtual {p4, v0, p1, p2, p3}, Lk0/t0;->K0(Ld0/I;IJ)V

    .line 115
    .line 116
    .line 117
    const/4 v5, 0x1

    .line 118
    invoke-virtual {p0, v2}, Lk0/f0;->o1(Lk0/U0;)J

    .line 119
    .line 120
    .line 121
    move-result-wide v6

    .line 122
    const/4 v3, 0x0

    .line 123
    const/4 v4, 0x1

    .line 124
    move-object v1, p0

    .line 125
    move v9, p5

    .line 126
    invoke-virtual/range {v1 .. v9}, Lk0/f0;->q2(Lk0/U0;IZIJIZ)V

    .line 127
    .line 128
    .line 129
    return-void
.end method

.method public final Z1(Lk0/U0;Ld0/I;Landroid/util/Pair;)Lk0/U0;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    invoke-virtual/range {p2 .. p2}, Ld0/I;->q()Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    const/4 v4, 0x1

    .line 12
    if-nez v3, :cond_1

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v3, 0x0

    .line 18
    goto :goto_1

    .line 19
    :cond_1
    :goto_0
    move v3, v4

    .line 20
    :goto_1
    invoke-static {v3}, Lg0/a;->a(Z)V

    .line 21
    .line 22
    .line 23
    move-object/from16 v3, p1

    .line 24
    .line 25
    iget-object v5, v3, Lk0/U0;->a:Ld0/I;

    .line 26
    .line 27
    invoke-virtual/range {p0 .. p1}, Lk0/f0;->n1(Lk0/U0;)J

    .line 28
    .line 29
    .line 30
    move-result-wide v6

    .line 31
    invoke-virtual/range {p1 .. p2}, Lk0/U0;->j(Ld0/I;)Lk0/U0;

    .line 32
    .line 33
    .line 34
    move-result-object v8

    .line 35
    invoke-virtual/range {p2 .. p2}, Ld0/I;->q()Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_2

    .line 40
    .line 41
    invoke-static {}, Lk0/U0;->l()Lx0/x$b;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    iget-wide v2, v0, Lk0/f0;->x0:J

    .line 46
    .line 47
    invoke-static {v2, v3}, Lg0/M;->J0(J)J

    .line 48
    .line 49
    .line 50
    move-result-wide v14

    .line 51
    sget-object v18, Lx0/Z;->d:Lx0/Z;

    .line 52
    .line 53
    iget-object v2, v0, Lk0/f0;->b:LA0/E;

    .line 54
    .line 55
    invoke-static {}, LX2/v;->Y()LX2/v;

    .line 56
    .line 57
    .line 58
    move-result-object v20

    .line 59
    const-wide/16 v16, 0x0

    .line 60
    .line 61
    move-object v9, v1

    .line 62
    move-wide v10, v14

    .line 63
    move-wide v12, v14

    .line 64
    move-object/from16 v19, v2

    .line 65
    .line 66
    invoke-virtual/range {v8 .. v20}, Lk0/U0;->d(Lx0/x$b;JJJJLx0/Z;LA0/E;Ljava/util/List;)Lk0/U0;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-virtual {v2, v1}, Lk0/U0;->c(Lx0/x$b;)Lk0/U0;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    iget-wide v2, v1, Lk0/U0;->s:J

    .line 75
    .line 76
    iput-wide v2, v1, Lk0/U0;->q:J

    .line 77
    .line 78
    return-object v1

    .line 79
    :cond_2
    iget-object v3, v8, Lk0/U0;->b:Lx0/x$b;

    .line 80
    .line 81
    iget-object v3, v3, Lx0/x$b;->a:Ljava/lang/Object;

    .line 82
    .line 83
    invoke-static/range {p3 .. p3}, Lg0/M;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v9

    .line 87
    check-cast v9, Landroid/util/Pair;

    .line 88
    .line 89
    iget-object v9, v9, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 90
    .line 91
    invoke-virtual {v3, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v9

    .line 95
    xor-int/2addr v9, v4

    .line 96
    if-eqz v9, :cond_3

    .line 97
    .line 98
    new-instance v10, Lx0/x$b;

    .line 99
    .line 100
    iget-object v11, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 101
    .line 102
    invoke-direct {v10, v11}, Lx0/x$b;-><init>(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    :goto_2
    move-object v14, v10

    .line 106
    goto :goto_3

    .line 107
    :cond_3
    iget-object v10, v8, Lk0/U0;->b:Lx0/x$b;

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :goto_3
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v2, Ljava/lang/Long;

    .line 113
    .line 114
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 115
    .line 116
    .line 117
    move-result-wide v12

    .line 118
    invoke-static {v6, v7}, Lg0/M;->J0(J)J

    .line 119
    .line 120
    .line 121
    move-result-wide v6

    .line 122
    invoke-virtual {v5}, Ld0/I;->q()Z

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    if-nez v2, :cond_4

    .line 127
    .line 128
    iget-object v2, v0, Lk0/f0;->n:Ld0/I$b;

    .line 129
    .line 130
    invoke-virtual {v5, v3, v2}, Ld0/I;->h(Ljava/lang/Object;Ld0/I$b;)Ld0/I$b;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    invoke-virtual {v2}, Ld0/I$b;->n()J

    .line 135
    .line 136
    .line 137
    move-result-wide v2

    .line 138
    sub-long/2addr v6, v2

    .line 139
    :cond_4
    if-nez v9, :cond_5

    .line 140
    .line 141
    cmp-long v2, v12, v6

    .line 142
    .line 143
    if-gez v2, :cond_6

    .line 144
    .line 145
    :cond_5
    move-wide v6, v12

    .line 146
    move-object v0, v14

    .line 147
    goto/16 :goto_7

    .line 148
    .line 149
    :cond_6
    if-nez v2, :cond_a

    .line 150
    .line 151
    iget-object v2, v8, Lk0/U0;->k:Lx0/x$b;

    .line 152
    .line 153
    iget-object v2, v2, Lx0/x$b;->a:Ljava/lang/Object;

    .line 154
    .line 155
    invoke-virtual {v1, v2}, Ld0/I;->b(Ljava/lang/Object;)I

    .line 156
    .line 157
    .line 158
    move-result v2

    .line 159
    const/4 v3, -0x1

    .line 160
    if-eq v2, v3, :cond_7

    .line 161
    .line 162
    iget-object v3, v0, Lk0/f0;->n:Ld0/I$b;

    .line 163
    .line 164
    invoke-virtual {v1, v2, v3}, Ld0/I;->f(ILd0/I$b;)Ld0/I$b;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    iget v2, v2, Ld0/I$b;->c:I

    .line 169
    .line 170
    iget-object v3, v14, Lx0/x$b;->a:Ljava/lang/Object;

    .line 171
    .line 172
    iget-object v4, v0, Lk0/f0;->n:Ld0/I$b;

    .line 173
    .line 174
    invoke-virtual {v1, v3, v4}, Ld0/I;->h(Ljava/lang/Object;Ld0/I$b;)Ld0/I$b;

    .line 175
    .line 176
    .line 177
    move-result-object v3

    .line 178
    iget v3, v3, Ld0/I$b;->c:I

    .line 179
    .line 180
    if-eq v2, v3, :cond_9

    .line 181
    .line 182
    :cond_7
    iget-object v2, v14, Lx0/x$b;->a:Ljava/lang/Object;

    .line 183
    .line 184
    iget-object v3, v0, Lk0/f0;->n:Ld0/I$b;

    .line 185
    .line 186
    invoke-virtual {v1, v2, v3}, Ld0/I;->h(Ljava/lang/Object;Ld0/I$b;)Ld0/I$b;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v14}, Lx0/x$b;->b()Z

    .line 190
    .line 191
    .line 192
    move-result v1

    .line 193
    if-eqz v1, :cond_8

    .line 194
    .line 195
    iget-object v1, v0, Lk0/f0;->n:Ld0/I$b;

    .line 196
    .line 197
    iget v2, v14, Lx0/x$b;->b:I

    .line 198
    .line 199
    iget v3, v14, Lx0/x$b;->c:I

    .line 200
    .line 201
    invoke-virtual {v1, v2, v3}, Ld0/I$b;->b(II)J

    .line 202
    .line 203
    .line 204
    move-result-wide v1

    .line 205
    goto :goto_4

    .line 206
    :cond_8
    iget-object v1, v0, Lk0/f0;->n:Ld0/I$b;

    .line 207
    .line 208
    iget-wide v1, v1, Ld0/I$b;->d:J

    .line 209
    .line 210
    :goto_4
    iget-wide v10, v8, Lk0/U0;->s:J

    .line 211
    .line 212
    iget-wide v12, v8, Lk0/U0;->s:J

    .line 213
    .line 214
    iget-wide v3, v8, Lk0/U0;->d:J

    .line 215
    .line 216
    iget-wide v5, v8, Lk0/U0;->s:J

    .line 217
    .line 218
    sub-long v16, v1, v5

    .line 219
    .line 220
    iget-object v5, v8, Lk0/U0;->h:Lx0/Z;

    .line 221
    .line 222
    iget-object v6, v8, Lk0/U0;->i:LA0/E;

    .line 223
    .line 224
    iget-object v7, v8, Lk0/U0;->j:Ljava/util/List;

    .line 225
    .line 226
    move-object v9, v14

    .line 227
    move-object v0, v14

    .line 228
    move-wide v14, v3

    .line 229
    move-object/from16 v18, v5

    .line 230
    .line 231
    move-object/from16 v19, v6

    .line 232
    .line 233
    move-object/from16 v20, v7

    .line 234
    .line 235
    invoke-virtual/range {v8 .. v20}, Lk0/U0;->d(Lx0/x$b;JJJJLx0/Z;LA0/E;Ljava/util/List;)Lk0/U0;

    .line 236
    .line 237
    .line 238
    move-result-object v3

    .line 239
    invoke-virtual {v3, v0}, Lk0/U0;->c(Lx0/x$b;)Lk0/U0;

    .line 240
    .line 241
    .line 242
    move-result-object v8

    .line 243
    goto :goto_6

    .line 244
    :cond_9
    :goto_5
    move-object/from16 v0, p0

    .line 245
    .line 246
    goto/16 :goto_e

    .line 247
    .line 248
    :cond_a
    move-object v0, v14

    .line 249
    invoke-virtual {v0}, Lx0/x$b;->b()Z

    .line 250
    .line 251
    .line 252
    move-result v1

    .line 253
    xor-int/2addr v1, v4

    .line 254
    invoke-static {v1}, Lg0/a;->f(Z)V

    .line 255
    .line 256
    .line 257
    iget-wide v1, v8, Lk0/U0;->r:J

    .line 258
    .line 259
    sub-long v3, v12, v6

    .line 260
    .line 261
    sub-long/2addr v1, v3

    .line 262
    const-wide/16 v3, 0x0

    .line 263
    .line 264
    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->max(JJ)J

    .line 265
    .line 266
    .line 267
    move-result-wide v16

    .line 268
    iget-wide v1, v8, Lk0/U0;->q:J

    .line 269
    .line 270
    iget-object v3, v8, Lk0/U0;->k:Lx0/x$b;

    .line 271
    .line 272
    iget-object v4, v8, Lk0/U0;->b:Lx0/x$b;

    .line 273
    .line 274
    invoke-virtual {v3, v4}, Lx0/x$b;->equals(Ljava/lang/Object;)Z

    .line 275
    .line 276
    .line 277
    move-result v3

    .line 278
    if-eqz v3, :cond_b

    .line 279
    .line 280
    add-long v1, v12, v16

    .line 281
    .line 282
    :cond_b
    iget-object v3, v8, Lk0/U0;->h:Lx0/Z;

    .line 283
    .line 284
    iget-object v4, v8, Lk0/U0;->i:LA0/E;

    .line 285
    .line 286
    iget-object v5, v8, Lk0/U0;->j:Ljava/util/List;

    .line 287
    .line 288
    move-object v9, v0

    .line 289
    move-wide v10, v12

    .line 290
    move-wide v6, v12

    .line 291
    move-wide v14, v6

    .line 292
    move-object/from16 v18, v3

    .line 293
    .line 294
    move-object/from16 v19, v4

    .line 295
    .line 296
    move-object/from16 v20, v5

    .line 297
    .line 298
    invoke-virtual/range {v8 .. v20}, Lk0/U0;->d(Lx0/x$b;JJJJLx0/Z;LA0/E;Ljava/util/List;)Lk0/U0;

    .line 299
    .line 300
    .line 301
    move-result-object v8

    .line 302
    :goto_6
    iput-wide v1, v8, Lk0/U0;->q:J

    .line 303
    .line 304
    goto :goto_5

    .line 305
    :goto_7
    invoke-virtual {v0}, Lx0/x$b;->b()Z

    .line 306
    .line 307
    .line 308
    move-result v1

    .line 309
    xor-int/2addr v1, v4

    .line 310
    invoke-static {v1}, Lg0/a;->f(Z)V

    .line 311
    .line 312
    .line 313
    if-eqz v9, :cond_c

    .line 314
    .line 315
    sget-object v1, Lx0/Z;->d:Lx0/Z;

    .line 316
    .line 317
    :goto_8
    move-object/from16 v18, v1

    .line 318
    .line 319
    goto :goto_9

    .line 320
    :cond_c
    iget-object v1, v8, Lk0/U0;->h:Lx0/Z;

    .line 321
    .line 322
    goto :goto_8

    .line 323
    :goto_9
    move-object v1, v0

    .line 324
    move-object/from16 v0, p0

    .line 325
    .line 326
    if-eqz v9, :cond_d

    .line 327
    .line 328
    iget-object v2, v0, Lk0/f0;->b:LA0/E;

    .line 329
    .line 330
    :goto_a
    move-object/from16 v19, v2

    .line 331
    .line 332
    goto :goto_b

    .line 333
    :cond_d
    iget-object v2, v8, Lk0/U0;->i:LA0/E;

    .line 334
    .line 335
    goto :goto_a

    .line 336
    :goto_b
    if-eqz v9, :cond_e

    .line 337
    .line 338
    invoke-static {}, LX2/v;->Y()LX2/v;

    .line 339
    .line 340
    .line 341
    move-result-object v2

    .line 342
    :goto_c
    move-object/from16 v20, v2

    .line 343
    .line 344
    goto :goto_d

    .line 345
    :cond_e
    iget-object v2, v8, Lk0/U0;->j:Ljava/util/List;

    .line 346
    .line 347
    goto :goto_c

    .line 348
    :goto_d
    const-wide/16 v16, 0x0

    .line 349
    .line 350
    move-object v9, v1

    .line 351
    move-wide v10, v6

    .line 352
    move-wide v12, v6

    .line 353
    move-wide v14, v6

    .line 354
    invoke-virtual/range {v8 .. v20}, Lk0/U0;->d(Lx0/x$b;JJJJLx0/Z;LA0/E;Ljava/util/List;)Lk0/U0;

    .line 355
    .line 356
    .line 357
    move-result-object v2

    .line 358
    invoke-virtual {v2, v1}, Lk0/U0;->c(Lx0/x$b;)Lk0/U0;

    .line 359
    .line 360
    .line 361
    move-result-object v8

    .line 362
    iput-wide v6, v8, Lk0/U0;->q:J

    .line 363
    .line 364
    :goto_e
    return-object v8
.end method

.method public final a2(Ld0/I;IJ)Landroid/util/Pair;
    .locals 6

    .line 1
    invoke-virtual {p1}, Ld0/I;->q()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iput p2, p0, Lk0/f0;->v0:I

    .line 8
    .line 9
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    cmp-long p1, p3, p1

    .line 15
    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    const-wide/16 p3, 0x0

    .line 19
    .line 20
    :cond_0
    iput-wide p3, p0, Lk0/f0;->x0:J

    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    iput p1, p0, Lk0/f0;->w0:I

    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    return-object p1

    .line 27
    :cond_1
    const/4 v0, -0x1

    .line 28
    if-eq p2, v0, :cond_3

    .line 29
    .line 30
    invoke-virtual {p1}, Ld0/I;->p()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-lt p2, v0, :cond_2

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_2
    :goto_0
    move v3, p2

    .line 38
    goto :goto_2

    .line 39
    :cond_3
    :goto_1
    iget-boolean p2, p0, Lk0/f0;->J:Z

    .line 40
    .line 41
    invoke-virtual {p1, p2}, Ld0/I;->a(Z)I

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    iget-object p3, p0, Ld0/f;->a:Ld0/I$c;

    .line 46
    .line 47
    invoke-virtual {p1, p2, p3}, Ld0/I;->n(ILd0/I$c;)Ld0/I$c;

    .line 48
    .line 49
    .line 50
    move-result-object p3

    .line 51
    invoke-virtual {p3}, Ld0/I$c;->b()J

    .line 52
    .line 53
    .line 54
    move-result-wide p3

    .line 55
    goto :goto_0

    .line 56
    :goto_2
    iget-object v1, p0, Ld0/f;->a:Ld0/I$c;

    .line 57
    .line 58
    iget-object v2, p0, Lk0/f0;->n:Ld0/I$b;

    .line 59
    .line 60
    invoke-static {p3, p4}, Lg0/M;->J0(J)J

    .line 61
    .line 62
    .line 63
    move-result-wide v4

    .line 64
    move-object v0, p1

    .line 65
    invoke-virtual/range {v0 .. v5}, Ld0/I;->j(Ld0/I$c;Ld0/I$b;IJ)Landroid/util/Pair;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    return-object p1
.end method

.method public final b2(II)V
    .locals 3

    .line 1
    iget-object v0, p0, Lk0/f0;->e0:Lg0/A;

    .line 2
    .line 3
    invoke-virtual {v0}, Lg0/A;->b()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lk0/f0;->e0:Lg0/A;

    .line 10
    .line 11
    invoke-virtual {v0}, Lg0/A;->a()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eq p2, v0, :cond_1

    .line 16
    .line 17
    :cond_0
    new-instance v0, Lg0/A;

    .line 18
    .line 19
    invoke-direct {v0, p1, p2}, Lg0/A;-><init>(II)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lk0/f0;->e0:Lg0/A;

    .line 23
    .line 24
    iget-object v0, p0, Lk0/f0;->l:Lg0/n;

    .line 25
    .line 26
    new-instance v1, Lk0/U;

    .line 27
    .line 28
    invoke-direct {v1, p1, p2}, Lk0/U;-><init>(II)V

    .line 29
    .line 30
    .line 31
    const/16 v2, 0x18

    .line 32
    .line 33
    invoke-virtual {v0, v2, v1}, Lg0/n;->k(ILg0/n$a;)V

    .line 34
    .line 35
    .line 36
    new-instance v0, Lg0/A;

    .line 37
    .line 38
    invoke-direct {v0, p1, p2}, Lg0/A;-><init>(II)V

    .line 39
    .line 40
    .line 41
    const/4 p1, 0x2

    .line 42
    const/16 p2, 0xe

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2, v0}, Lk0/f0;->f2(IILjava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    :cond_1
    return-void
.end method

.method public c1(Ll0/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lk0/f0;->r:Ll0/a;

    .line 2
    .line 3
    invoke-static {p1}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ll0/c;

    .line 8
    .line 9
    invoke-interface {v0, p1}, Ll0/a;->N(Ll0/c;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final c2(Ld0/I;Lx0/x$b;J)J
    .locals 1

    .line 1
    iget-object p2, p2, Lx0/x$b;->a:Ljava/lang/Object;

    .line 2
    .line 3
    iget-object v0, p0, Lk0/f0;->n:Ld0/I$b;

    .line 4
    .line 5
    invoke-virtual {p1, p2, v0}, Ld0/I;->h(Ljava/lang/Object;Ld0/I$b;)Ld0/I$b;

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lk0/f0;->n:Ld0/I$b;

    .line 9
    .line 10
    invoke-virtual {p1}, Ld0/I$b;->n()J

    .line 11
    .line 12
    .line 13
    move-result-wide p1

    .line 14
    add-long/2addr p3, p1

    .line 15
    return-wide p3
.end method

.method public d(Z)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lk0/f0;->u2()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lk0/f0;->k0:Z

    .line 5
    .line 6
    if-ne v0, p1, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iput-boolean p1, p0, Lk0/f0;->k0:Z

    .line 10
    .line 11
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/4 v1, 0x1

    .line 16
    const/16 v2, 0x9

    .line 17
    .line 18
    invoke-virtual {p0, v1, v2, v0}, Lk0/f0;->f2(IILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lk0/f0;->l:Lg0/n;

    .line 22
    .line 23
    new-instance v1, Lk0/J;

    .line 24
    .line 25
    invoke-direct {v1, p1}, Lk0/J;-><init>(Z)V

    .line 26
    .line 27
    .line 28
    const/16 p1, 0x17

    .line 29
    .line 30
    invoke-virtual {v0, p1, v1}, Lg0/n;->k(ILg0/n$a;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public d1(Lk0/w$a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lk0/f0;->m:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final d2(II)V
    .locals 2

    .line 1
    add-int/lit8 v0, p2, -0x1

    .line 2
    .line 3
    :goto_0
    if-lt v0, p1, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lk0/f0;->o:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    add-int/lit8 v0, v0, -0x1

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-object v0, p0, Lk0/f0;->O:Lx0/T;

    .line 14
    .line 15
    invoke-interface {v0, p1, p2}, Lx0/T;->b(II)Lx0/T;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, Lk0/f0;->O:Lx0/T;

    .line 20
    .line 21
    return-void
.end method

.method public e(Lx0/x;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lk0/f0;->u2()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p0, p1}, Lk0/f0;->i2(Ljava/util/List;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final e1(ILjava/util/List;)Ljava/util/List;
    .locals 7

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-ge v1, v2, :cond_0

    .line 12
    .line 13
    new-instance v2, Lk0/T0$c;

    .line 14
    .line 15
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    check-cast v3, Lx0/x;

    .line 20
    .line 21
    iget-boolean v4, p0, Lk0/f0;->p:Z

    .line 22
    .line 23
    invoke-direct {v2, v3, v4}, Lk0/T0$c;-><init>(Lx0/x;Z)V

    .line 24
    .line 25
    .line 26
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    iget-object v3, p0, Lk0/f0;->o:Ljava/util/List;

    .line 30
    .line 31
    add-int v4, v1, p1

    .line 32
    .line 33
    new-instance v5, Lk0/f0$f;

    .line 34
    .line 35
    iget-object v6, v2, Lk0/T0$c;->b:Ljava/lang/Object;

    .line 36
    .line 37
    iget-object v2, v2, Lk0/T0$c;->a:Lx0/t;

    .line 38
    .line 39
    invoke-direct {v5, v6, v2}, Lk0/f0$f;-><init>(Ljava/lang/Object;Lx0/t;)V

    .line 40
    .line 41
    .line 42
    invoke-interface {v3, v4, v5}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    add-int/lit8 v1, v1, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    iget-object p2, p0, Lk0/f0;->O:Lx0/T;

    .line 49
    .line 50
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    invoke-interface {p2, p1, v1}, Lx0/T;->d(II)Lx0/T;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iput-object p1, p0, Lk0/f0;->O:Lx0/T;

    .line 59
    .line 60
    return-object v0
.end method

.method public final e2()V
    .locals 3

    .line 1
    iget-object v0, p0, Lk0/f0;->b0:Landroid/view/TextureView;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/view/TextureView;->getSurfaceTextureListener()Landroid/view/TextureView$SurfaceTextureListener;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v2, p0, Lk0/f0;->y:Lk0/f0$d;

    .line 11
    .line 12
    if-eq v0, v2, :cond_0

    .line 13
    .line 14
    const-string v0, "ExoPlayerImpl"

    .line 15
    .line 16
    const-string v2, "SurfaceTextureListener already unset or replaced."

    .line 17
    .line 18
    invoke-static {v0, v2}, Lg0/o;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object v0, p0, Lk0/f0;->b0:Landroid/view/TextureView;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iput-object v1, p0, Lk0/f0;->b0:Landroid/view/TextureView;

    .line 28
    .line 29
    :cond_1
    iget-object v0, p0, Lk0/f0;->Z:Landroid/view/SurfaceHolder;

    .line 30
    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    iget-object v2, p0, Lk0/f0;->y:Lk0/f0$d;

    .line 34
    .line 35
    invoke-interface {v0, v2}, Landroid/view/SurfaceHolder;->removeCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 36
    .line 37
    .line 38
    iput-object v1, p0, Lk0/f0;->Z:Landroid/view/SurfaceHolder;

    .line 39
    .line 40
    :cond_2
    return-void
.end method

.method public f()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lk0/f0;->u2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lk0/f0;->u0:Lk0/U0;

    .line 5
    .line 6
    iget v0, v0, Lk0/U0;->e:I

    .line 7
    .line 8
    return v0
.end method

.method public final f1()Ld0/w;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lk0/f0;->L()Ld0/I;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ld0/I;->q()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lk0/f0;->t0:Ld0/w;

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    invoke-virtual {p0}, Lk0/f0;->E()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    iget-object v2, p0, Ld0/f;->a:Ld0/I$c;

    .line 19
    .line 20
    invoke-virtual {v0, v1, v2}, Ld0/I;->n(ILd0/I$c;)Ld0/I$c;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-object v0, v0, Ld0/I$c;->c:Ld0/u;

    .line 25
    .line 26
    iget-object v1, p0, Lk0/f0;->t0:Ld0/w;

    .line 27
    .line 28
    invoke-virtual {v1}, Ld0/w;->a()Ld0/w$b;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iget-object v0, v0, Ld0/u;->e:Ld0/w;

    .line 33
    .line 34
    invoke-virtual {v1, v0}, Ld0/w$b;->K(Ld0/w;)Ld0/w$b;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0}, Ld0/w$b;->I()Ld0/w;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    return-object v0
.end method

.method public final f2(IILjava/lang/Object;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lk0/f0;->g:[Lk0/Y0;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v1, :cond_2

    .line 6
    .line 7
    aget-object v3, v0, v2

    .line 8
    .line 9
    const/4 v4, -0x1

    .line 10
    if-eq p1, v4, :cond_0

    .line 11
    .line 12
    invoke-interface {v3}, Lk0/Y0;->l()I

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    if-ne v4, p1, :cond_1

    .line 17
    .line 18
    :cond_0
    invoke-virtual {p0, v3}, Lk0/f0;->j1(Lk0/V0$b;)Lk0/V0;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-virtual {v3, p2}, Lk0/V0;->n(I)Lk0/V0;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v3, p3}, Lk0/V0;->m(Ljava/lang/Object;)Lk0/V0;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-virtual {v3}, Lk0/V0;->l()Lk0/V0;

    .line 31
    .line 32
    .line 33
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    return-void
.end method

.method public g()V
    .locals 13

    .line 1
    invoke-virtual {p0}, Lk0/f0;->u2()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lk0/f0;->u()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    iget-object v1, p0, Lk0/f0;->B:Lk0/m;

    .line 9
    .line 10
    const/4 v2, 0x2

    .line 11
    invoke-virtual {v1, v0, v2}, Lk0/m;->p(ZI)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-static {v1}, Lk0/f0;->q1(I)I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    invoke-virtual {p0, v0, v1, v3}, Lk0/f0;->p2(ZII)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lk0/f0;->u0:Lk0/U0;

    .line 23
    .line 24
    iget v1, v0, Lk0/U0;->e:I

    .line 25
    .line 26
    const/4 v3, 0x1

    .line 27
    if-eq v1, v3, :cond_0

    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    const/4 v1, 0x0

    .line 31
    invoke-virtual {v0, v1}, Lk0/U0;->f(Lk0/u;)Lk0/U0;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iget-object v1, v0, Lk0/U0;->a:Ld0/I;

    .line 36
    .line 37
    invoke-virtual {v1}, Ld0/I;->q()Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    const/4 v2, 0x4

    .line 44
    :cond_1
    invoke-virtual {v0, v2}, Lk0/U0;->h(I)Lk0/U0;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    iget v0, p0, Lk0/f0;->K:I

    .line 49
    .line 50
    add-int/2addr v0, v3

    .line 51
    iput v0, p0, Lk0/f0;->K:I

    .line 52
    .line 53
    iget-object v0, p0, Lk0/f0;->k:Lk0/t0;

    .line 54
    .line 55
    invoke-virtual {v0}, Lk0/t0;->r0()V

    .line 56
    .line 57
    .line 58
    const/4 v11, -0x1

    .line 59
    const/4 v12, 0x0

    .line 60
    const/4 v6, 0x1

    .line 61
    const/4 v7, 0x0

    .line 62
    const/4 v8, 0x5

    .line 63
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    move-object v4, p0

    .line 69
    invoke-virtual/range {v4 .. v12}, Lk0/f0;->q2(Lk0/U0;IZIJIZ)V

    .line 70
    .line 71
    .line 72
    return-void
.end method

.method public final g1(ZI)I
    .locals 1

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_0
    iget-boolean p2, p0, Lk0/f0;->H:Z

    .line 6
    .line 7
    if-eqz p2, :cond_2

    .line 8
    .line 9
    const/4 p2, 0x3

    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0}, Lk0/f0;->w1()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    return p2

    .line 19
    :cond_1
    if-nez p1, :cond_2

    .line 20
    .line 21
    iget-object p1, p0, Lk0/f0;->u0:Lk0/U0;

    .line 22
    .line 23
    iget p1, p1, Lk0/U0;->n:I

    .line 24
    .line 25
    if-ne p1, p2, :cond_2

    .line 26
    .line 27
    return p2

    .line 28
    :cond_2
    const/4 p1, 0x0

    .line 29
    return p1
.end method

.method public final g2(ILjava/lang/Object;)V
    .locals 1

    .line 1
    const/4 v0, -0x1

    .line 2
    invoke-virtual {p0, v0, p1, p2}, Lk0/f0;->f2(IILjava/lang/Object;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public h()Ld0/C;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lk0/f0;->u2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lk0/f0;->u0:Lk0/U0;

    .line 5
    .line 6
    iget-object v0, v0, Lk0/U0;->o:Ld0/C;

    .line 7
    .line 8
    return-object v0
.end method

.method public final h2()V
    .locals 3

    .line 1
    iget v0, p0, Lk0/f0;->j0:F

    .line 2
    .line 3
    iget-object v1, p0, Lk0/f0;->B:Lk0/m;

    .line 4
    .line 5
    invoke-virtual {v1}, Lk0/m;->g()F

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    mul-float/2addr v0, v1

    .line 10
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x1

    .line 15
    const/4 v2, 0x2

    .line 16
    invoke-virtual {p0, v1, v2, v0}, Lk0/f0;->f2(IILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public i(I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lk0/f0;->u2()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lk0/f0;->I:I

    .line 5
    .line 6
    if-eq v0, p1, :cond_0

    .line 7
    .line 8
    iput p1, p0, Lk0/f0;->I:I

    .line 9
    .line 10
    iget-object v0, p0, Lk0/f0;->k:Lk0/t0;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lk0/t0;->f1(I)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lk0/f0;->l:Lg0/n;

    .line 16
    .line 17
    new-instance v1, Lk0/M;

    .line 18
    .line 19
    invoke-direct {v1, p1}, Lk0/M;-><init>(I)V

    .line 20
    .line 21
    .line 22
    const/16 p1, 0x8

    .line 23
    .line 24
    invoke-virtual {v0, p1, v1}, Lg0/n;->i(ILg0/n$a;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lk0/f0;->o2()V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lk0/f0;->l:Lg0/n;

    .line 31
    .line 32
    invoke-virtual {p1}, Lg0/n;->f()V

    .line 33
    .line 34
    .line 35
    :cond_0
    return-void
.end method

.method public final i1()Ld0/I;
    .locals 3

    .line 1
    new-instance v0, Lk0/W0;

    .line 2
    .line 3
    iget-object v1, p0, Lk0/f0;->o:Ljava/util/List;

    .line 4
    .line 5
    iget-object v2, p0, Lk0/f0;->O:Lx0/T;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Lk0/W0;-><init>(Ljava/util/Collection;Lx0/T;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public i2(Ljava/util/List;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lk0/f0;->u2()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    invoke-virtual {p0, p1, v0}, Lk0/f0;->j2(Ljava/util/List;Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public j()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lk0/f0;->u2()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lk0/f0;->h0:I

    .line 5
    .line 6
    return v0
.end method

.method public final j1(Lk0/V0$b;)Lk0/V0;
    .locals 9

    .line 1
    iget-object v0, p0, Lk0/f0;->u0:Lk0/U0;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lk0/f0;->p1(Lk0/U0;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    new-instance v8, Lk0/V0;

    .line 8
    .line 9
    iget-object v2, p0, Lk0/f0;->k:Lk0/t0;

    .line 10
    .line 11
    iget-object v1, p0, Lk0/f0;->u0:Lk0/U0;

    .line 12
    .line 13
    iget-object v4, v1, Lk0/U0;->a:Ld0/I;

    .line 14
    .line 15
    const/4 v1, -0x1

    .line 16
    if-ne v0, v1, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    :cond_0
    move v5, v0

    .line 20
    iget-object v6, p0, Lk0/f0;->x:Lg0/c;

    .line 21
    .line 22
    invoke-virtual {v2}, Lk0/t0;->I()Landroid/os/Looper;

    .line 23
    .line 24
    .line 25
    move-result-object v7

    .line 26
    move-object v1, v8

    .line 27
    move-object v3, p1

    .line 28
    invoke-direct/range {v1 .. v7}, Lk0/V0;-><init>(Lk0/V0$a;Lk0/V0$b;Ld0/I;ILg0/c;Landroid/os/Looper;)V

    .line 29
    .line 30
    .line 31
    return-object v8
.end method

.method public j2(Ljava/util/List;Z)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lk0/f0;->u2()V

    .line 2
    .line 3
    .line 4
    const/4 v2, -0x1

    .line 5
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    move-object v0, p0

    .line 11
    move-object v1, p1

    .line 12
    move v5, p2

    .line 13
    invoke-virtual/range {v0 .. v5}, Lk0/f0;->k2(Ljava/util/List;IJZ)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public k(Ld0/C;)V
    .locals 10

    .line 1
    invoke-virtual {p0}, Lk0/f0;->u2()V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    sget-object p1, Ld0/C;->d:Ld0/C;

    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lk0/f0;->u0:Lk0/U0;

    .line 9
    .line 10
    iget-object v0, v0, Lk0/U0;->o:Ld0/C;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ld0/C;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    return-void

    .line 19
    :cond_1
    iget-object v0, p0, Lk0/f0;->u0:Lk0/U0;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Lk0/U0;->g(Ld0/C;)Lk0/U0;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    iget v0, p0, Lk0/f0;->K:I

    .line 26
    .line 27
    add-int/lit8 v0, v0, 0x1

    .line 28
    .line 29
    iput v0, p0, Lk0/f0;->K:I

    .line 30
    .line 31
    iget-object v0, p0, Lk0/f0;->k:Lk0/t0;

    .line 32
    .line 33
    invoke-virtual {v0, p1}, Lk0/t0;->c1(Ld0/C;)V

    .line 34
    .line 35
    .line 36
    const/4 v8, -0x1

    .line 37
    const/4 v9, 0x0

    .line 38
    const/4 v3, 0x0

    .line 39
    const/4 v4, 0x0

    .line 40
    const/4 v5, 0x5

    .line 41
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    move-object v1, p0

    .line 47
    invoke-virtual/range {v1 .. v9}, Lk0/f0;->q2(Lk0/U0;IZIJIZ)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public final k1(Lk0/U0;Lk0/U0;ZIZZ)Landroid/util/Pair;
    .locals 6

    .line 1
    iget-object v0, p2, Lk0/U0;->a:Ld0/I;

    .line 2
    .line 3
    iget-object v1, p1, Lk0/U0;->a:Ld0/I;

    .line 4
    .line 5
    invoke-virtual {v1}, Ld0/I;->q()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, -0x1

    .line 10
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0}, Ld0/I;->q()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    new-instance p1, Landroid/util/Pair;

    .line 23
    .line 24
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 25
    .line 26
    invoke-direct {p1, p2, v3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-object p1

    .line 30
    :cond_0
    invoke-virtual {v1}, Ld0/I;->q()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    invoke-virtual {v0}, Ld0/I;->q()Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    const/4 v5, 0x3

    .line 39
    if-eq v2, v4, :cond_1

    .line 40
    .line 41
    new-instance p1, Landroid/util/Pair;

    .line 42
    .line 43
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 44
    .line 45
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    move-result-object p3

    .line 49
    invoke-direct {p1, p2, p3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    return-object p1

    .line 53
    :cond_1
    iget-object v2, p2, Lk0/U0;->b:Lx0/x$b;

    .line 54
    .line 55
    iget-object v2, v2, Lx0/x$b;->a:Ljava/lang/Object;

    .line 56
    .line 57
    iget-object v4, p0, Lk0/f0;->n:Ld0/I$b;

    .line 58
    .line 59
    invoke-virtual {v0, v2, v4}, Ld0/I;->h(Ljava/lang/Object;Ld0/I$b;)Ld0/I$b;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    iget v2, v2, Ld0/I$b;->c:I

    .line 64
    .line 65
    iget-object v4, p0, Ld0/f;->a:Ld0/I$c;

    .line 66
    .line 67
    invoke-virtual {v0, v2, v4}, Ld0/I;->n(ILd0/I$c;)Ld0/I$c;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    iget-object v0, v0, Ld0/I$c;->a:Ljava/lang/Object;

    .line 72
    .line 73
    iget-object v2, p1, Lk0/U0;->b:Lx0/x$b;

    .line 74
    .line 75
    iget-object v2, v2, Lx0/x$b;->a:Ljava/lang/Object;

    .line 76
    .line 77
    iget-object v4, p0, Lk0/f0;->n:Ld0/I$b;

    .line 78
    .line 79
    invoke-virtual {v1, v2, v4}, Ld0/I;->h(Ljava/lang/Object;Ld0/I$b;)Ld0/I$b;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    iget v2, v2, Ld0/I$b;->c:I

    .line 84
    .line 85
    iget-object v4, p0, Ld0/f;->a:Ld0/I$c;

    .line 86
    .line 87
    invoke-virtual {v1, v2, v4}, Ld0/I;->n(ILd0/I$c;)Ld0/I$c;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    iget-object v1, v1, Ld0/I$c;->a:Ljava/lang/Object;

    .line 92
    .line 93
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    const/4 v1, 0x2

    .line 98
    const/4 v2, 0x1

    .line 99
    if-nez v0, :cond_5

    .line 100
    .line 101
    if-eqz p3, :cond_2

    .line 102
    .line 103
    if-nez p4, :cond_2

    .line 104
    .line 105
    move v5, v2

    .line 106
    goto :goto_0

    .line 107
    :cond_2
    if-eqz p3, :cond_3

    .line 108
    .line 109
    if-ne p4, v2, :cond_3

    .line 110
    .line 111
    move v5, v1

    .line 112
    goto :goto_0

    .line 113
    :cond_3
    if-eqz p5, :cond_4

    .line 114
    .line 115
    :goto_0
    new-instance p1, Landroid/util/Pair;

    .line 116
    .line 117
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 118
    .line 119
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 120
    .line 121
    .line 122
    move-result-object p3

    .line 123
    invoke-direct {p1, p2, p3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    return-object p1

    .line 127
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 128
    .line 129
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 130
    .line 131
    .line 132
    throw p1

    .line 133
    :cond_5
    if-eqz p3, :cond_6

    .line 134
    .line 135
    if-nez p4, :cond_6

    .line 136
    .line 137
    iget-object p2, p2, Lk0/U0;->b:Lx0/x$b;

    .line 138
    .line 139
    iget-wide v4, p2, Lx0/x$b;->d:J

    .line 140
    .line 141
    iget-object p1, p1, Lk0/U0;->b:Lx0/x$b;

    .line 142
    .line 143
    iget-wide p1, p1, Lx0/x$b;->d:J

    .line 144
    .line 145
    cmp-long p1, v4, p1

    .line 146
    .line 147
    if-gez p1, :cond_6

    .line 148
    .line 149
    new-instance p1, Landroid/util/Pair;

    .line 150
    .line 151
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 152
    .line 153
    const/4 p3, 0x0

    .line 154
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 155
    .line 156
    .line 157
    move-result-object p3

    .line 158
    invoke-direct {p1, p2, p3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    return-object p1

    .line 162
    :cond_6
    if-eqz p3, :cond_7

    .line 163
    .line 164
    if-ne p4, v2, :cond_7

    .line 165
    .line 166
    if-eqz p6, :cond_7

    .line 167
    .line 168
    new-instance p1, Landroid/util/Pair;

    .line 169
    .line 170
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 171
    .line 172
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 173
    .line 174
    .line 175
    move-result-object p3

    .line 176
    invoke-direct {p1, p2, p3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    return-object p1

    .line 180
    :cond_7
    new-instance p1, Landroid/util/Pair;

    .line 181
    .line 182
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 183
    .line 184
    invoke-direct {p1, p2, v3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    return-object p1
.end method

.method public final k2(Ljava/util/List;IJZ)V
    .locals 16

    .line 1
    move-object/from16 v9, p0

    .line 2
    .line 3
    move/from16 v0, p2

    .line 4
    .line 5
    iget-object v1, v9, Lk0/f0;->u0:Lk0/U0;

    .line 6
    .line 7
    invoke-virtual {v9, v1}, Lk0/f0;->p1(Lk0/U0;)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-virtual/range {p0 .. p0}, Lk0/f0;->P()J

    .line 12
    .line 13
    .line 14
    move-result-wide v2

    .line 15
    iget v4, v9, Lk0/f0;->K:I

    .line 16
    .line 17
    const/4 v5, 0x1

    .line 18
    add-int/2addr v4, v5

    .line 19
    iput v4, v9, Lk0/f0;->K:I

    .line 20
    .line 21
    iget-object v4, v9, Lk0/f0;->o:Ljava/util/List;

    .line 22
    .line 23
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    const/4 v6, 0x0

    .line 28
    if-nez v4, :cond_0

    .line 29
    .line 30
    iget-object v4, v9, Lk0/f0;->o:Ljava/util/List;

    .line 31
    .line 32
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    invoke-virtual {v9, v6, v4}, Lk0/f0;->d2(II)V

    .line 37
    .line 38
    .line 39
    :cond_0
    move-object/from16 v4, p1

    .line 40
    .line 41
    invoke-virtual {v9, v6, v4}, Lk0/f0;->e1(ILjava/util/List;)Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v11

    .line 45
    invoke-virtual/range {p0 .. p0}, Lk0/f0;->i1()Ld0/I;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    invoke-virtual {v4}, Ld0/I;->q()Z

    .line 50
    .line 51
    .line 52
    move-result v7

    .line 53
    if-nez v7, :cond_1

    .line 54
    .line 55
    invoke-virtual {v4}, Ld0/I;->p()I

    .line 56
    .line 57
    .line 58
    move-result v7

    .line 59
    if-ge v0, v7, :cond_2

    .line 60
    .line 61
    :cond_1
    move-wide/from16 v7, p3

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    new-instance v1, Ld0/s;

    .line 65
    .line 66
    move-wide/from16 v7, p3

    .line 67
    .line 68
    invoke-direct {v1, v4, v0, v7, v8}, Ld0/s;-><init>(Ld0/I;IJ)V

    .line 69
    .line 70
    .line 71
    throw v1

    .line 72
    :goto_0
    const/4 v10, -0x1

    .line 73
    if-eqz p5, :cond_3

    .line 74
    .line 75
    iget-boolean v0, v9, Lk0/f0;->J:Z

    .line 76
    .line 77
    invoke-virtual {v4, v0}, Ld0/I;->a(Z)I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    move v12, v0

    .line 87
    goto :goto_1

    .line 88
    :cond_3
    if-ne v0, v10, :cond_4

    .line 89
    .line 90
    move v12, v1

    .line 91
    move-wide v1, v2

    .line 92
    goto :goto_1

    .line 93
    :cond_4
    move v12, v0

    .line 94
    move-wide v1, v7

    .line 95
    :goto_1
    iget-object v0, v9, Lk0/f0;->u0:Lk0/U0;

    .line 96
    .line 97
    invoke-virtual {v9, v4, v12, v1, v2}, Lk0/f0;->a2(Ld0/I;IJ)Landroid/util/Pair;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    invoke-virtual {v9, v0, v4, v3}, Lk0/f0;->Z1(Lk0/U0;Ld0/I;Landroid/util/Pair;)Lk0/U0;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    iget v3, v0, Lk0/U0;->e:I

    .line 106
    .line 107
    if-eq v12, v10, :cond_7

    .line 108
    .line 109
    if-eq v3, v5, :cond_7

    .line 110
    .line 111
    invoke-virtual {v4}, Ld0/I;->q()Z

    .line 112
    .line 113
    .line 114
    move-result v3

    .line 115
    if-nez v3, :cond_6

    .line 116
    .line 117
    invoke-virtual {v4}, Ld0/I;->p()I

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    if-lt v12, v3, :cond_5

    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_5
    const/4 v3, 0x2

    .line 125
    goto :goto_3

    .line 126
    :cond_6
    :goto_2
    const/4 v3, 0x4

    .line 127
    :cond_7
    :goto_3
    invoke-virtual {v0, v3}, Lk0/U0;->h(I)Lk0/U0;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    iget-object v10, v9, Lk0/f0;->k:Lk0/t0;

    .line 132
    .line 133
    invoke-static {v1, v2}, Lg0/M;->J0(J)J

    .line 134
    .line 135
    .line 136
    move-result-wide v13

    .line 137
    iget-object v15, v9, Lk0/f0;->O:Lx0/T;

    .line 138
    .line 139
    invoke-virtual/range {v10 .. v15}, Lk0/t0;->X0(Ljava/util/List;IJLx0/T;)V

    .line 140
    .line 141
    .line 142
    iget-object v0, v9, Lk0/f0;->u0:Lk0/U0;

    .line 143
    .line 144
    iget-object v0, v0, Lk0/U0;->b:Lx0/x$b;

    .line 145
    .line 146
    iget-object v0, v0, Lx0/x$b;->a:Ljava/lang/Object;

    .line 147
    .line 148
    iget-object v1, v3, Lk0/U0;->b:Lx0/x$b;

    .line 149
    .line 150
    iget-object v1, v1, Lx0/x$b;->a:Ljava/lang/Object;

    .line 151
    .line 152
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v0

    .line 156
    if-nez v0, :cond_8

    .line 157
    .line 158
    iget-object v0, v9, Lk0/f0;->u0:Lk0/U0;

    .line 159
    .line 160
    iget-object v0, v0, Lk0/U0;->a:Ld0/I;

    .line 161
    .line 162
    invoke-virtual {v0}, Ld0/I;->q()Z

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    if-nez v0, :cond_8

    .line 167
    .line 168
    goto :goto_4

    .line 169
    :cond_8
    move v5, v6

    .line 170
    :goto_4
    invoke-virtual {v9, v3}, Lk0/f0;->o1(Lk0/U0;)J

    .line 171
    .line 172
    .line 173
    move-result-wide v6

    .line 174
    const/4 v8, -0x1

    .line 175
    const/4 v10, 0x0

    .line 176
    const/4 v2, 0x0

    .line 177
    const/4 v4, 0x4

    .line 178
    move-object/from16 v0, p0

    .line 179
    .line 180
    move-object v1, v3

    .line 181
    move v3, v5

    .line 182
    move-wide v5, v6

    .line 183
    move v7, v8

    .line 184
    move v8, v10

    .line 185
    invoke-virtual/range {v0 .. v8}, Lk0/f0;->q2(Lk0/U0;IZIJIZ)V

    .line 186
    .line 187
    .line 188
    return-void
.end method

.method public l(F)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lk0/f0;->u2()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    const/high16 v1, 0x3f800000    # 1.0f

    .line 6
    .line 7
    invoke-static {p1, v0, v1}, Lg0/M;->o(FFF)F

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    iget v0, p0, Lk0/f0;->j0:F

    .line 12
    .line 13
    cmpl-float v0, v0, p1

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iput p1, p0, Lk0/f0;->j0:F

    .line 19
    .line 20
    invoke-virtual {p0}, Lk0/f0;->h2()V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lk0/f0;->l:Lg0/n;

    .line 24
    .line 25
    new-instance v1, Lk0/K;

    .line 26
    .line 27
    invoke-direct {v1, p1}, Lk0/K;-><init>(F)V

    .line 28
    .line 29
    .line 30
    const/16 p1, 0x16

    .line 31
    .line 32
    invoke-virtual {v0, p1, v1}, Lg0/n;->k(ILg0/n$a;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public l1()Landroid/os/Looper;
    .locals 1

    .line 1
    iget-object v0, p0, Lk0/f0;->s:Landroid/os/Looper;

    .line 2
    .line 3
    return-object v0
.end method

.method public final l2(Landroid/graphics/SurfaceTexture;)V
    .locals 1

    .line 1
    new-instance v0, Landroid/view/Surface;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lk0/f0;->m2(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lk0/f0;->Y:Landroid/view/Surface;

    .line 10
    .line 11
    return-void
.end method

.method public bridge synthetic m()Ld0/B;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lk0/f0;->r1()Lk0/u;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public m1()J
    .locals 5

    .line 1
    invoke-virtual {p0}, Lk0/f0;->u2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lk0/f0;->u0:Lk0/U0;

    .line 5
    .line 6
    iget-object v0, v0, Lk0/U0;->a:Ld0/I;

    .line 7
    .line 8
    invoke-virtual {v0}, Ld0/I;->q()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-wide v0, p0, Lk0/f0;->x0:J

    .line 15
    .line 16
    return-wide v0

    .line 17
    :cond_0
    iget-object v0, p0, Lk0/f0;->u0:Lk0/U0;

    .line 18
    .line 19
    iget-object v1, v0, Lk0/U0;->k:Lx0/x$b;

    .line 20
    .line 21
    iget-wide v1, v1, Lx0/x$b;->d:J

    .line 22
    .line 23
    iget-object v3, v0, Lk0/U0;->b:Lx0/x$b;

    .line 24
    .line 25
    iget-wide v3, v3, Lx0/x$b;->d:J

    .line 26
    .line 27
    cmp-long v1, v1, v3

    .line 28
    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    iget-object v0, v0, Lk0/U0;->a:Ld0/I;

    .line 32
    .line 33
    invoke-virtual {p0}, Lk0/f0;->E()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    iget-object v2, p0, Ld0/f;->a:Ld0/I$c;

    .line 38
    .line 39
    invoke-virtual {v0, v1, v2}, Ld0/I;->n(ILd0/I$c;)Ld0/I$c;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {v0}, Ld0/I$c;->d()J

    .line 44
    .line 45
    .line 46
    move-result-wide v0

    .line 47
    return-wide v0

    .line 48
    :cond_1
    iget-wide v0, v0, Lk0/U0;->q:J

    .line 49
    .line 50
    iget-object v2, p0, Lk0/f0;->u0:Lk0/U0;

    .line 51
    .line 52
    iget-object v2, v2, Lk0/U0;->k:Lx0/x$b;

    .line 53
    .line 54
    invoke-virtual {v2}, Lx0/x$b;->b()Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-eqz v2, :cond_3

    .line 59
    .line 60
    iget-object v0, p0, Lk0/f0;->u0:Lk0/U0;

    .line 61
    .line 62
    iget-object v1, v0, Lk0/U0;->a:Ld0/I;

    .line 63
    .line 64
    iget-object v0, v0, Lk0/U0;->k:Lx0/x$b;

    .line 65
    .line 66
    iget-object v0, v0, Lx0/x$b;->a:Ljava/lang/Object;

    .line 67
    .line 68
    iget-object v2, p0, Lk0/f0;->n:Ld0/I$b;

    .line 69
    .line 70
    invoke-virtual {v1, v0, v2}, Ld0/I;->h(Ljava/lang/Object;Ld0/I$b;)Ld0/I$b;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    iget-object v1, p0, Lk0/f0;->u0:Lk0/U0;

    .line 75
    .line 76
    iget-object v1, v1, Lk0/U0;->k:Lx0/x$b;

    .line 77
    .line 78
    iget v1, v1, Lx0/x$b;->b:I

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ld0/I$b;->f(I)J

    .line 81
    .line 82
    .line 83
    move-result-wide v1

    .line 84
    const-wide/high16 v3, -0x8000000000000000L

    .line 85
    .line 86
    cmp-long v3, v1, v3

    .line 87
    .line 88
    if-nez v3, :cond_2

    .line 89
    .line 90
    iget-wide v0, v0, Ld0/I$b;->d:J

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_2
    move-wide v0, v1

    .line 94
    :cond_3
    :goto_0
    iget-object v2, p0, Lk0/f0;->u0:Lk0/U0;

    .line 95
    .line 96
    iget-object v3, v2, Lk0/U0;->a:Ld0/I;

    .line 97
    .line 98
    iget-object v2, v2, Lk0/U0;->k:Lx0/x$b;

    .line 99
    .line 100
    invoke-virtual {p0, v3, v2, v0, v1}, Lk0/f0;->c2(Ld0/I;Lx0/x$b;J)J

    .line 101
    .line 102
    .line 103
    move-result-wide v0

    .line 104
    invoke-static {v0, v1}, Lg0/M;->i1(J)J

    .line 105
    .line 106
    .line 107
    move-result-wide v0

    .line 108
    return-wide v0
.end method

.method public final m2(Ljava/lang/Object;)V
    .locals 9

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lk0/f0;->g:[Lk0/Y0;

    .line 7
    .line 8
    array-length v2, v1

    .line 9
    const/4 v3, 0x0

    .line 10
    move v4, v3

    .line 11
    :goto_0
    const/4 v5, 0x1

    .line 12
    if-ge v4, v2, :cond_1

    .line 13
    .line 14
    aget-object v6, v1, v4

    .line 15
    .line 16
    invoke-interface {v6}, Lk0/Y0;->l()I

    .line 17
    .line 18
    .line 19
    move-result v7

    .line 20
    const/4 v8, 0x2

    .line 21
    if-ne v7, v8, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0, v6}, Lk0/f0;->j1(Lk0/V0$b;)Lk0/V0;

    .line 24
    .line 25
    .line 26
    move-result-object v6

    .line 27
    invoke-virtual {v6, v5}, Lk0/V0;->n(I)Lk0/V0;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    invoke-virtual {v5, p1}, Lk0/V0;->m(Ljava/lang/Object;)Lk0/V0;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    invoke-virtual {v5}, Lk0/V0;->l()Lk0/V0;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    iget-object v1, p0, Lk0/f0;->X:Ljava/lang/Object;

    .line 46
    .line 47
    if-eqz v1, :cond_3

    .line 48
    .line 49
    if-eq v1, p1, :cond_3

    .line 50
    .line 51
    :try_start_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-eqz v1, :cond_2

    .line 60
    .line 61
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    check-cast v1, Lk0/V0;

    .line 66
    .line 67
    iget-wide v6, p0, Lk0/f0;->F:J

    .line 68
    .line 69
    invoke-virtual {v1, v6, v7}, Lk0/V0;->a(J)Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :catch_0
    move v3, v5

    .line 74
    goto :goto_2

    .line 75
    :catch_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 80
    .line 81
    .line 82
    :cond_2
    :goto_2
    iget-object v0, p0, Lk0/f0;->X:Ljava/lang/Object;

    .line 83
    .line 84
    iget-object v1, p0, Lk0/f0;->Y:Landroid/view/Surface;

    .line 85
    .line 86
    if-ne v0, v1, :cond_3

    .line 87
    .line 88
    invoke-virtual {v1}, Landroid/view/Surface;->release()V

    .line 89
    .line 90
    .line 91
    const/4 v0, 0x0

    .line 92
    iput-object v0, p0, Lk0/f0;->Y:Landroid/view/Surface;

    .line 93
    .line 94
    :cond_3
    iput-object p1, p0, Lk0/f0;->X:Ljava/lang/Object;

    .line 95
    .line 96
    if-eqz v3, :cond_4

    .line 97
    .line 98
    new-instance p1, Lk0/u0;

    .line 99
    .line 100
    const/4 v0, 0x3

    .line 101
    invoke-direct {p1, v0}, Lk0/u0;-><init>(I)V

    .line 102
    .line 103
    .line 104
    const/16 v0, 0x3eb

    .line 105
    .line 106
    invoke-static {p1, v0}, Lk0/u;->d(Ljava/lang/RuntimeException;I)Lk0/u;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-virtual {p0, p1}, Lk0/f0;->n2(Lk0/u;)V

    .line 111
    .line 112
    .line 113
    :cond_4
    return-void
.end method

.method public n(Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lk0/f0;->u2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lk0/f0;->B:Lk0/m;

    .line 5
    .line 6
    invoke-virtual {p0}, Lk0/f0;->f()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-virtual {v0, p1, v1}, Lk0/m;->p(ZI)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-static {v0}, Lk0/f0;->q1(I)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-virtual {p0, p1, v0, v1}, Lk0/f0;->p2(ZII)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final n1(Lk0/U0;)J
    .locals 4

    .line 1
    iget-object v0, p1, Lk0/U0;->b:Lx0/x$b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lx0/x$b;->b()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p1, Lk0/U0;->a:Ld0/I;

    .line 10
    .line 11
    iget-object v1, p1, Lk0/U0;->b:Lx0/x$b;

    .line 12
    .line 13
    iget-object v1, v1, Lx0/x$b;->a:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v2, p0, Lk0/f0;->n:Ld0/I$b;

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Ld0/I;->h(Ljava/lang/Object;Ld0/I$b;)Ld0/I$b;

    .line 18
    .line 19
    .line 20
    iget-wide v0, p1, Lk0/U0;->c:J

    .line 21
    .line 22
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    cmp-long v0, v0, v2

    .line 28
    .line 29
    if-nez v0, :cond_0

    .line 30
    .line 31
    iget-object v0, p1, Lk0/U0;->a:Ld0/I;

    .line 32
    .line 33
    invoke-virtual {p0, p1}, Lk0/f0;->p1(Lk0/U0;)I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    iget-object v1, p0, Ld0/f;->a:Ld0/I$c;

    .line 38
    .line 39
    invoke-virtual {v0, p1, v1}, Ld0/I;->n(ILd0/I$c;)Ld0/I$c;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p1}, Ld0/I$c;->b()J

    .line 44
    .line 45
    .line 46
    move-result-wide v0

    .line 47
    goto :goto_0

    .line 48
    :cond_0
    iget-object v0, p0, Lk0/f0;->n:Ld0/I$b;

    .line 49
    .line 50
    invoke-virtual {v0}, Ld0/I$b;->m()J

    .line 51
    .line 52
    .line 53
    move-result-wide v0

    .line 54
    iget-wide v2, p1, Lk0/U0;->c:J

    .line 55
    .line 56
    invoke-static {v2, v3}, Lg0/M;->i1(J)J

    .line 57
    .line 58
    .line 59
    move-result-wide v2

    .line 60
    add-long/2addr v0, v2

    .line 61
    :goto_0
    return-wide v0

    .line 62
    :cond_1
    invoke-virtual {p0, p1}, Lk0/f0;->o1(Lk0/U0;)J

    .line 63
    .line 64
    .line 65
    move-result-wide v0

    .line 66
    invoke-static {v0, v1}, Lg0/M;->i1(J)J

    .line 67
    .line 68
    .line 69
    move-result-wide v0

    .line 70
    return-wide v0
.end method

.method public final n2(Lk0/u;)V
    .locals 11

    .line 1
    iget-object v0, p0, Lk0/f0;->u0:Lk0/U0;

    .line 2
    .line 3
    iget-object v1, v0, Lk0/U0;->b:Lx0/x$b;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lk0/U0;->c(Lx0/x$b;)Lk0/U0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-wide v1, v0, Lk0/U0;->s:J

    .line 10
    .line 11
    iput-wide v1, v0, Lk0/U0;->q:J

    .line 12
    .line 13
    const-wide/16 v1, 0x0

    .line 14
    .line 15
    iput-wide v1, v0, Lk0/U0;->r:J

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-virtual {v0, v1}, Lk0/U0;->h(I)Lk0/U0;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    invoke-virtual {v0, p1}, Lk0/U0;->f(Lk0/u;)Lk0/U0;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :cond_0
    move-object v3, v0

    .line 29
    iget p1, p0, Lk0/f0;->K:I

    .line 30
    .line 31
    add-int/2addr p1, v1

    .line 32
    iput p1, p0, Lk0/f0;->K:I

    .line 33
    .line 34
    iget-object p1, p0, Lk0/f0;->k:Lk0/t0;

    .line 35
    .line 36
    invoke-virtual {p1}, Lk0/t0;->s1()V

    .line 37
    .line 38
    .line 39
    const/4 v9, -0x1

    .line 40
    const/4 v10, 0x0

    .line 41
    const/4 v4, 0x0

    .line 42
    const/4 v5, 0x0

    .line 43
    const/4 v6, 0x5

    .line 44
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    move-object v2, p0

    .line 50
    invoke-virtual/range {v2 .. v10}, Lk0/f0;->q2(Lk0/U0;IZIJIZ)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public o()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lk0/f0;->u2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lk0/f0;->u0:Lk0/U0;

    .line 5
    .line 6
    iget-object v0, v0, Lk0/U0;->b:Lx0/x$b;

    .line 7
    .line 8
    invoke-virtual {v0}, Lx0/x$b;->b()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0
.end method

.method public final o1(Lk0/U0;)J
    .locals 3

    .line 1
    iget-object v0, p1, Lk0/U0;->a:Ld0/I;

    .line 2
    .line 3
    invoke-virtual {v0}, Ld0/I;->q()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-wide v0, p0, Lk0/f0;->x0:J

    .line 10
    .line 11
    invoke-static {v0, v1}, Lg0/M;->J0(J)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    return-wide v0

    .line 16
    :cond_0
    iget-boolean v0, p1, Lk0/U0;->p:Z

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {p1}, Lk0/U0;->m()J

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    iget-wide v0, p1, Lk0/U0;->s:J

    .line 26
    .line 27
    :goto_0
    iget-object v2, p1, Lk0/U0;->b:Lx0/x$b;

    .line 28
    .line 29
    invoke-virtual {v2}, Lx0/x$b;->b()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    return-wide v0

    .line 36
    :cond_2
    iget-object v2, p1, Lk0/U0;->a:Ld0/I;

    .line 37
    .line 38
    iget-object p1, p1, Lk0/U0;->b:Lx0/x$b;

    .line 39
    .line 40
    invoke-virtual {p0, v2, p1, v0, v1}, Lk0/f0;->c2(Ld0/I;Lx0/x$b;J)J

    .line 41
    .line 42
    .line 43
    move-result-wide v0

    .line 44
    return-wide v0
.end method

.method public final o2()V
    .locals 3

    .line 1
    iget-object v0, p0, Lk0/f0;->R:Ld0/D$b;

    .line 2
    .line 3
    iget-object v1, p0, Lk0/f0;->f:Ld0/D;

    .line 4
    .line 5
    iget-object v2, p0, Lk0/f0;->c:Ld0/D$b;

    .line 6
    .line 7
    invoke-static {v1, v2}, Lg0/M;->N(Ld0/D;Ld0/D$b;)Ld0/D$b;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iput-object v1, p0, Lk0/f0;->R:Ld0/D$b;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Ld0/D$b;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lk0/f0;->l:Lg0/n;

    .line 20
    .line 21
    new-instance v1, Lk0/W;

    .line 22
    .line 23
    invoke-direct {v1, p0}, Lk0/W;-><init>(Lk0/f0;)V

    .line 24
    .line 25
    .line 26
    const/16 v2, 0xd

    .line 27
    .line 28
    invoke-virtual {v0, v2, v1}, Lg0/n;->i(ILg0/n$a;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void
.end method

.method public p()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lk0/f0;->u2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lk0/f0;->u0:Lk0/U0;

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lk0/f0;->n1(Lk0/U0;)J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    return-wide v0
.end method

.method public final p1(Lk0/U0;)I
    .locals 2

    .line 1
    iget-object v0, p1, Lk0/U0;->a:Ld0/I;

    .line 2
    .line 3
    invoke-virtual {v0}, Ld0/I;->q()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget p1, p0, Lk0/f0;->v0:I

    .line 10
    .line 11
    return p1

    .line 12
    :cond_0
    iget-object v0, p1, Lk0/U0;->a:Ld0/I;

    .line 13
    .line 14
    iget-object p1, p1, Lk0/U0;->b:Lx0/x$b;

    .line 15
    .line 16
    iget-object p1, p1, Lx0/x$b;->a:Ljava/lang/Object;

    .line 17
    .line 18
    iget-object v1, p0, Lk0/f0;->n:Ld0/I$b;

    .line 19
    .line 20
    invoke-virtual {v0, p1, v1}, Ld0/I;->h(Ljava/lang/Object;Ld0/I$b;)Ld0/I$b;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iget p1, p1, Ld0/I$b;->c:I

    .line 25
    .line 26
    return p1
.end method

.method public final p2(ZII)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const/4 p1, -0x1

    .line 4
    if-eq p2, p1, :cond_0

    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    :goto_0
    invoke-virtual {p0, p1, p2}, Lk0/f0;->g1(ZI)I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    iget-object v0, p0, Lk0/f0;->u0:Lk0/U0;

    .line 14
    .line 15
    iget-boolean v1, v0, Lk0/U0;->l:Z

    .line 16
    .line 17
    if-ne v1, p1, :cond_1

    .line 18
    .line 19
    iget v1, v0, Lk0/U0;->n:I

    .line 20
    .line 21
    if-ne v1, p2, :cond_1

    .line 22
    .line 23
    iget v0, v0, Lk0/U0;->m:I

    .line 24
    .line 25
    if-ne v0, p3, :cond_1

    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    invoke-virtual {p0, p1, p3, p2}, Lk0/f0;->r2(ZII)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public q()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lk0/f0;->u2()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lk0/f0;->I:I

    .line 5
    .line 6
    return v0
.end method

.method public final q2(Lk0/U0;IZIJIZ)V
    .locals 16

    .line 1
    move-object/from16 v7, p0

    .line 2
    .line 3
    move-object/from16 v8, p1

    .line 4
    .line 5
    move/from16 v9, p4

    .line 6
    .line 7
    iget-object v10, v7, Lk0/f0;->u0:Lk0/U0;

    .line 8
    .line 9
    iput-object v8, v7, Lk0/f0;->u0:Lk0/U0;

    .line 10
    .line 11
    iget-object v0, v10, Lk0/U0;->a:Ld0/I;

    .line 12
    .line 13
    iget-object v1, v8, Lk0/U0;->a:Ld0/I;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ld0/I;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v11, 0x1

    .line 20
    xor-int/lit8 v12, v0, 0x1

    .line 21
    .line 22
    move-object/from16 v0, p0

    .line 23
    .line 24
    move-object/from16 v1, p1

    .line 25
    .line 26
    move-object v2, v10

    .line 27
    move/from16 v3, p3

    .line 28
    .line 29
    move/from16 v4, p4

    .line 30
    .line 31
    move v5, v12

    .line 32
    move/from16 v6, p8

    .line 33
    .line 34
    invoke-virtual/range {v0 .. v6}, Lk0/f0;->k1(Lk0/U0;Lk0/U0;ZIZZ)Landroid/util/Pair;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v1, Ljava/lang/Boolean;

    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v0, Ljava/lang/Integer;

    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    const/4 v2, 0x0

    .line 55
    if-eqz v1, :cond_1

    .line 56
    .line 57
    iget-object v3, v8, Lk0/U0;->a:Ld0/I;

    .line 58
    .line 59
    invoke-virtual {v3}, Ld0/I;->q()Z

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-nez v3, :cond_0

    .line 64
    .line 65
    iget-object v2, v8, Lk0/U0;->a:Ld0/I;

    .line 66
    .line 67
    iget-object v3, v8, Lk0/U0;->b:Lx0/x$b;

    .line 68
    .line 69
    iget-object v3, v3, Lx0/x$b;->a:Ljava/lang/Object;

    .line 70
    .line 71
    iget-object v4, v7, Lk0/f0;->n:Ld0/I$b;

    .line 72
    .line 73
    invoke-virtual {v2, v3, v4}, Ld0/I;->h(Ljava/lang/Object;Ld0/I$b;)Ld0/I$b;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    iget v2, v2, Ld0/I$b;->c:I

    .line 78
    .line 79
    iget-object v3, v8, Lk0/U0;->a:Ld0/I;

    .line 80
    .line 81
    iget-object v4, v7, Ld0/f;->a:Ld0/I$c;

    .line 82
    .line 83
    invoke-virtual {v3, v2, v4}, Ld0/I;->n(ILd0/I$c;)Ld0/I$c;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    iget-object v2, v2, Ld0/I$c;->c:Ld0/u;

    .line 88
    .line 89
    :cond_0
    sget-object v3, Ld0/w;->H:Ld0/w;

    .line 90
    .line 91
    iput-object v3, v7, Lk0/f0;->t0:Ld0/w;

    .line 92
    .line 93
    :cond_1
    if-nez v1, :cond_2

    .line 94
    .line 95
    iget-object v3, v10, Lk0/U0;->j:Ljava/util/List;

    .line 96
    .line 97
    iget-object v4, v8, Lk0/U0;->j:Ljava/util/List;

    .line 98
    .line 99
    invoke-interface {v3, v4}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    if-nez v3, :cond_3

    .line 104
    .line 105
    :cond_2
    iget-object v3, v7, Lk0/f0;->t0:Ld0/w;

    .line 106
    .line 107
    invoke-virtual {v3}, Ld0/w;->a()Ld0/w$b;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    iget-object v4, v8, Lk0/U0;->j:Ljava/util/List;

    .line 112
    .line 113
    invoke-virtual {v3, v4}, Ld0/w$b;->M(Ljava/util/List;)Ld0/w$b;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    invoke-virtual {v3}, Ld0/w$b;->I()Ld0/w;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    iput-object v3, v7, Lk0/f0;->t0:Ld0/w;

    .line 122
    .line 123
    :cond_3
    invoke-virtual/range {p0 .. p0}, Lk0/f0;->f1()Ld0/w;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    iget-object v4, v7, Lk0/f0;->S:Ld0/w;

    .line 128
    .line 129
    invoke-virtual {v3, v4}, Ld0/w;->equals(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v4

    .line 133
    xor-int/2addr v4, v11

    .line 134
    iput-object v3, v7, Lk0/f0;->S:Ld0/w;

    .line 135
    .line 136
    iget-boolean v3, v10, Lk0/U0;->l:Z

    .line 137
    .line 138
    iget-boolean v5, v8, Lk0/U0;->l:Z

    .line 139
    .line 140
    const/4 v6, 0x0

    .line 141
    if-eq v3, v5, :cond_4

    .line 142
    .line 143
    move v3, v11

    .line 144
    goto :goto_0

    .line 145
    :cond_4
    move v3, v6

    .line 146
    :goto_0
    iget v5, v10, Lk0/U0;->e:I

    .line 147
    .line 148
    iget v13, v8, Lk0/U0;->e:I

    .line 149
    .line 150
    if-eq v5, v13, :cond_5

    .line 151
    .line 152
    move v5, v11

    .line 153
    goto :goto_1

    .line 154
    :cond_5
    move v5, v6

    .line 155
    :goto_1
    if-nez v5, :cond_6

    .line 156
    .line 157
    if-eqz v3, :cond_7

    .line 158
    .line 159
    :cond_6
    invoke-virtual/range {p0 .. p0}, Lk0/f0;->t2()V

    .line 160
    .line 161
    .line 162
    :cond_7
    iget-boolean v13, v10, Lk0/U0;->g:Z

    .line 163
    .line 164
    iget-boolean v14, v8, Lk0/U0;->g:Z

    .line 165
    .line 166
    if-eq v13, v14, :cond_8

    .line 167
    .line 168
    move v13, v11

    .line 169
    goto :goto_2

    .line 170
    :cond_8
    move v13, v6

    .line 171
    :goto_2
    if-eqz v13, :cond_9

    .line 172
    .line 173
    invoke-virtual {v7, v14}, Lk0/f0;->s2(Z)V

    .line 174
    .line 175
    .line 176
    :cond_9
    if-eqz v12, :cond_a

    .line 177
    .line 178
    iget-object v12, v7, Lk0/f0;->l:Lg0/n;

    .line 179
    .line 180
    new-instance v14, Lk0/E;

    .line 181
    .line 182
    move/from16 v15, p2

    .line 183
    .line 184
    invoke-direct {v14, v8, v15}, Lk0/E;-><init>(Lk0/U0;I)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v12, v6, v14}, Lg0/n;->i(ILg0/n$a;)V

    .line 188
    .line 189
    .line 190
    :cond_a
    if-eqz p3, :cond_b

    .line 191
    .line 192
    move/from16 v6, p7

    .line 193
    .line 194
    invoke-virtual {v7, v9, v10, v6}, Lk0/f0;->t1(ILk0/U0;I)Ld0/D$e;

    .line 195
    .line 196
    .line 197
    move-result-object v6

    .line 198
    move-wide/from16 v14, p5

    .line 199
    .line 200
    invoke-virtual {v7, v14, v15}, Lk0/f0;->s1(J)Ld0/D$e;

    .line 201
    .line 202
    .line 203
    move-result-object v12

    .line 204
    iget-object v14, v7, Lk0/f0;->l:Lg0/n;

    .line 205
    .line 206
    new-instance v15, Lk0/a0;

    .line 207
    .line 208
    invoke-direct {v15, v9, v6, v12}, Lk0/a0;-><init>(ILd0/D$e;Ld0/D$e;)V

    .line 209
    .line 210
    .line 211
    const/16 v6, 0xb

    .line 212
    .line 213
    invoke-virtual {v14, v6, v15}, Lg0/n;->i(ILg0/n$a;)V

    .line 214
    .line 215
    .line 216
    :cond_b
    if-eqz v1, :cond_c

    .line 217
    .line 218
    iget-object v1, v7, Lk0/f0;->l:Lg0/n;

    .line 219
    .line 220
    new-instance v6, Lk0/b0;

    .line 221
    .line 222
    invoke-direct {v6, v2, v0}, Lk0/b0;-><init>(Ld0/u;I)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v1, v11, v6}, Lg0/n;->i(ILg0/n$a;)V

    .line 226
    .line 227
    .line 228
    :cond_c
    iget-object v0, v10, Lk0/U0;->f:Lk0/u;

    .line 229
    .line 230
    iget-object v1, v8, Lk0/U0;->f:Lk0/u;

    .line 231
    .line 232
    if-eq v0, v1, :cond_d

    .line 233
    .line 234
    iget-object v0, v7, Lk0/f0;->l:Lg0/n;

    .line 235
    .line 236
    new-instance v1, Lk0/c0;

    .line 237
    .line 238
    invoke-direct {v1, v8}, Lk0/c0;-><init>(Lk0/U0;)V

    .line 239
    .line 240
    .line 241
    const/16 v2, 0xa

    .line 242
    .line 243
    invoke-virtual {v0, v2, v1}, Lg0/n;->i(ILg0/n$a;)V

    .line 244
    .line 245
    .line 246
    iget-object v0, v8, Lk0/U0;->f:Lk0/u;

    .line 247
    .line 248
    if-eqz v0, :cond_d

    .line 249
    .line 250
    iget-object v0, v7, Lk0/f0;->l:Lg0/n;

    .line 251
    .line 252
    new-instance v1, Lk0/d0;

    .line 253
    .line 254
    invoke-direct {v1, v8}, Lk0/d0;-><init>(Lk0/U0;)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v0, v2, v1}, Lg0/n;->i(ILg0/n$a;)V

    .line 258
    .line 259
    .line 260
    :cond_d
    iget-object v0, v10, Lk0/U0;->i:LA0/E;

    .line 261
    .line 262
    iget-object v1, v8, Lk0/U0;->i:LA0/E;

    .line 263
    .line 264
    if-eq v0, v1, :cond_e

    .line 265
    .line 266
    iget-object v0, v7, Lk0/f0;->h:LA0/D;

    .line 267
    .line 268
    iget-object v1, v1, LA0/E;->e:Ljava/lang/Object;

    .line 269
    .line 270
    invoke-virtual {v0, v1}, LA0/D;->i(Ljava/lang/Object;)V

    .line 271
    .line 272
    .line 273
    iget-object v0, v7, Lk0/f0;->l:Lg0/n;

    .line 274
    .line 275
    new-instance v1, Lk0/e0;

    .line 276
    .line 277
    invoke-direct {v1, v8}, Lk0/e0;-><init>(Lk0/U0;)V

    .line 278
    .line 279
    .line 280
    const/4 v2, 0x2

    .line 281
    invoke-virtual {v0, v2, v1}, Lg0/n;->i(ILg0/n$a;)V

    .line 282
    .line 283
    .line 284
    :cond_e
    if-eqz v4, :cond_f

    .line 285
    .line 286
    iget-object v0, v7, Lk0/f0;->S:Ld0/w;

    .line 287
    .line 288
    iget-object v1, v7, Lk0/f0;->l:Lg0/n;

    .line 289
    .line 290
    new-instance v2, Lk0/F;

    .line 291
    .line 292
    invoke-direct {v2, v0}, Lk0/F;-><init>(Ld0/w;)V

    .line 293
    .line 294
    .line 295
    const/16 v0, 0xe

    .line 296
    .line 297
    invoke-virtual {v1, v0, v2}, Lg0/n;->i(ILg0/n$a;)V

    .line 298
    .line 299
    .line 300
    :cond_f
    if-eqz v13, :cond_10

    .line 301
    .line 302
    iget-object v0, v7, Lk0/f0;->l:Lg0/n;

    .line 303
    .line 304
    new-instance v1, Lk0/G;

    .line 305
    .line 306
    invoke-direct {v1, v8}, Lk0/G;-><init>(Lk0/U0;)V

    .line 307
    .line 308
    .line 309
    const/4 v2, 0x3

    .line 310
    invoke-virtual {v0, v2, v1}, Lg0/n;->i(ILg0/n$a;)V

    .line 311
    .line 312
    .line 313
    :cond_10
    if-nez v5, :cond_11

    .line 314
    .line 315
    if-eqz v3, :cond_12

    .line 316
    .line 317
    :cond_11
    iget-object v0, v7, Lk0/f0;->l:Lg0/n;

    .line 318
    .line 319
    new-instance v1, Lk0/H;

    .line 320
    .line 321
    invoke-direct {v1, v8}, Lk0/H;-><init>(Lk0/U0;)V

    .line 322
    .line 323
    .line 324
    const/4 v2, -0x1

    .line 325
    invoke-virtual {v0, v2, v1}, Lg0/n;->i(ILg0/n$a;)V

    .line 326
    .line 327
    .line 328
    :cond_12
    if-eqz v5, :cond_13

    .line 329
    .line 330
    iget-object v0, v7, Lk0/f0;->l:Lg0/n;

    .line 331
    .line 332
    new-instance v1, Lk0/I;

    .line 333
    .line 334
    invoke-direct {v1, v8}, Lk0/I;-><init>(Lk0/U0;)V

    .line 335
    .line 336
    .line 337
    const/4 v2, 0x4

    .line 338
    invoke-virtual {v0, v2, v1}, Lg0/n;->i(ILg0/n$a;)V

    .line 339
    .line 340
    .line 341
    :cond_13
    if-nez v3, :cond_14

    .line 342
    .line 343
    iget v0, v10, Lk0/U0;->m:I

    .line 344
    .line 345
    iget v1, v8, Lk0/U0;->m:I

    .line 346
    .line 347
    if-eq v0, v1, :cond_15

    .line 348
    .line 349
    :cond_14
    iget-object v0, v7, Lk0/f0;->l:Lg0/n;

    .line 350
    .line 351
    new-instance v1, Lk0/P;

    .line 352
    .line 353
    invoke-direct {v1, v8}, Lk0/P;-><init>(Lk0/U0;)V

    .line 354
    .line 355
    .line 356
    const/4 v2, 0x5

    .line 357
    invoke-virtual {v0, v2, v1}, Lg0/n;->i(ILg0/n$a;)V

    .line 358
    .line 359
    .line 360
    :cond_15
    iget v0, v10, Lk0/U0;->n:I

    .line 361
    .line 362
    iget v1, v8, Lk0/U0;->n:I

    .line 363
    .line 364
    if-eq v0, v1, :cond_16

    .line 365
    .line 366
    iget-object v0, v7, Lk0/f0;->l:Lg0/n;

    .line 367
    .line 368
    new-instance v1, Lk0/X;

    .line 369
    .line 370
    invoke-direct {v1, v8}, Lk0/X;-><init>(Lk0/U0;)V

    .line 371
    .line 372
    .line 373
    const/4 v2, 0x6

    .line 374
    invoke-virtual {v0, v2, v1}, Lg0/n;->i(ILg0/n$a;)V

    .line 375
    .line 376
    .line 377
    :cond_16
    invoke-virtual {v10}, Lk0/U0;->n()Z

    .line 378
    .line 379
    .line 380
    move-result v0

    .line 381
    invoke-virtual/range {p1 .. p1}, Lk0/U0;->n()Z

    .line 382
    .line 383
    .line 384
    move-result v1

    .line 385
    if-eq v0, v1, :cond_17

    .line 386
    .line 387
    iget-object v0, v7, Lk0/f0;->l:Lg0/n;

    .line 388
    .line 389
    new-instance v1, Lk0/Y;

    .line 390
    .line 391
    invoke-direct {v1, v8}, Lk0/Y;-><init>(Lk0/U0;)V

    .line 392
    .line 393
    .line 394
    const/4 v2, 0x7

    .line 395
    invoke-virtual {v0, v2, v1}, Lg0/n;->i(ILg0/n$a;)V

    .line 396
    .line 397
    .line 398
    :cond_17
    iget-object v0, v10, Lk0/U0;->o:Ld0/C;

    .line 399
    .line 400
    iget-object v1, v8, Lk0/U0;->o:Ld0/C;

    .line 401
    .line 402
    invoke-virtual {v0, v1}, Ld0/C;->equals(Ljava/lang/Object;)Z

    .line 403
    .line 404
    .line 405
    move-result v0

    .line 406
    if-nez v0, :cond_18

    .line 407
    .line 408
    iget-object v0, v7, Lk0/f0;->l:Lg0/n;

    .line 409
    .line 410
    new-instance v1, Lk0/Z;

    .line 411
    .line 412
    invoke-direct {v1, v8}, Lk0/Z;-><init>(Lk0/U0;)V

    .line 413
    .line 414
    .line 415
    const/16 v2, 0xc

    .line 416
    .line 417
    invoke-virtual {v0, v2, v1}, Lg0/n;->i(ILg0/n$a;)V

    .line 418
    .line 419
    .line 420
    :cond_18
    invoke-virtual/range {p0 .. p0}, Lk0/f0;->o2()V

    .line 421
    .line 422
    .line 423
    iget-object v0, v7, Lk0/f0;->l:Lg0/n;

    .line 424
    .line 425
    invoke-virtual {v0}, Lg0/n;->f()V

    .line 426
    .line 427
    .line 428
    iget-boolean v0, v10, Lk0/U0;->p:Z

    .line 429
    .line 430
    iget-boolean v1, v8, Lk0/U0;->p:Z

    .line 431
    .line 432
    if-eq v0, v1, :cond_19

    .line 433
    .line 434
    iget-object v0, v7, Lk0/f0;->m:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 435
    .line 436
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 437
    .line 438
    .line 439
    move-result-object v0

    .line 440
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 441
    .line 442
    .line 443
    move-result v1

    .line 444
    if-eqz v1, :cond_19

    .line 445
    .line 446
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object v1

    .line 450
    check-cast v1, Lk0/w$a;

    .line 451
    .line 452
    iget-boolean v2, v8, Lk0/U0;->p:Z

    .line 453
    .line 454
    invoke-interface {v1, v2}, Lk0/w$a;->C(Z)V

    .line 455
    .line 456
    .line 457
    goto :goto_3

    .line 458
    :cond_19
    return-void
.end method

.method public r()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lk0/f0;->u2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lk0/f0;->u0:Lk0/U0;

    .line 5
    .line 6
    iget-wide v0, v0, Lk0/U0;->r:J

    .line 7
    .line 8
    invoke-static {v0, v1}, Lg0/M;->i1(J)J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    return-wide v0
.end method

.method public r1()Lk0/u;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lk0/f0;->u2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lk0/f0;->u0:Lk0/U0;

    .line 5
    .line 6
    iget-object v0, v0, Lk0/U0;->f:Lk0/u;

    .line 7
    .line 8
    return-object v0
.end method

.method public final r2(ZII)V
    .locals 10

    .line 1
    iget v0, p0, Lk0/f0;->K:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Lk0/f0;->K:I

    .line 6
    .line 7
    iget-object v0, p0, Lk0/f0;->u0:Lk0/U0;

    .line 8
    .line 9
    iget-boolean v1, v0, Lk0/U0;->p:Z

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Lk0/U0;->a()Lk0/U0;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    :cond_0
    invoke-virtual {v0, p1, p2, p3}, Lk0/U0;->e(ZII)Lk0/U0;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    iget-object v0, p0, Lk0/f0;->k:Lk0/t0;

    .line 22
    .line 23
    invoke-virtual {v0, p1, p2, p3}, Lk0/t0;->a1(ZII)V

    .line 24
    .line 25
    .line 26
    const/4 v8, -0x1

    .line 27
    const/4 v9, 0x0

    .line 28
    const/4 v3, 0x0

    .line 29
    const/4 v4, 0x0

    .line 30
    const/4 v5, 0x5

    .line 31
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    move-object v1, p0

    .line 37
    invoke-virtual/range {v1 .. v9}, Lk0/f0;->q2(Lk0/U0;IZIJIZ)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public release()V
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "Release "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v1, " ["

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v1, "AndroidXMedia3/1.4.1"

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v1, "] ["

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    sget-object v2, Lg0/M;->e:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-static {}, Ld0/v;->b()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v1, "]"

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    const-string v1, "ExoPlayerImpl"

    .line 62
    .line 63
    invoke-static {v1, v0}, Lg0/o;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, Lk0/f0;->u2()V

    .line 67
    .line 68
    .line 69
    sget v0, Lg0/M;->a:I

    .line 70
    .line 71
    const/16 v1, 0x15

    .line 72
    .line 73
    const/4 v2, 0x0

    .line 74
    if-ge v0, v1, :cond_0

    .line 75
    .line 76
    iget-object v0, p0, Lk0/f0;->W:Landroid/media/AudioTrack;

    .line 77
    .line 78
    if-eqz v0, :cond_0

    .line 79
    .line 80
    invoke-virtual {v0}, Landroid/media/AudioTrack;->release()V

    .line 81
    .line 82
    .line 83
    iput-object v2, p0, Lk0/f0;->W:Landroid/media/AudioTrack;

    .line 84
    .line 85
    :cond_0
    iget-object v0, p0, Lk0/f0;->A:Lk0/b;

    .line 86
    .line 87
    const/4 v1, 0x0

    .line 88
    invoke-virtual {v0, v1}, Lk0/b;->b(Z)V

    .line 89
    .line 90
    .line 91
    iget-object v0, p0, Lk0/f0;->C:Lk0/g1;

    .line 92
    .line 93
    if-eqz v0, :cond_1

    .line 94
    .line 95
    invoke-virtual {v0}, Lk0/g1;->g()V

    .line 96
    .line 97
    .line 98
    :cond_1
    iget-object v0, p0, Lk0/f0;->D:Lk0/i1;

    .line 99
    .line 100
    invoke-virtual {v0, v1}, Lk0/i1;->b(Z)V

    .line 101
    .line 102
    .line 103
    iget-object v0, p0, Lk0/f0;->E:Lk0/j1;

    .line 104
    .line 105
    invoke-virtual {v0, v1}, Lk0/j1;->b(Z)V

    .line 106
    .line 107
    .line 108
    iget-object v0, p0, Lk0/f0;->B:Lk0/m;

    .line 109
    .line 110
    invoke-virtual {v0}, Lk0/m;->i()V

    .line 111
    .line 112
    .line 113
    iget-object v0, p0, Lk0/f0;->k:Lk0/t0;

    .line 114
    .line 115
    invoke-virtual {v0}, Lk0/t0;->t0()Z

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    if-nez v0, :cond_2

    .line 120
    .line 121
    iget-object v0, p0, Lk0/f0;->l:Lg0/n;

    .line 122
    .line 123
    new-instance v1, Lk0/L;

    .line 124
    .line 125
    invoke-direct {v1}, Lk0/L;-><init>()V

    .line 126
    .line 127
    .line 128
    const/16 v3, 0xa

    .line 129
    .line 130
    invoke-virtual {v0, v3, v1}, Lg0/n;->k(ILg0/n$a;)V

    .line 131
    .line 132
    .line 133
    :cond_2
    iget-object v0, p0, Lk0/f0;->l:Lg0/n;

    .line 134
    .line 135
    invoke-virtual {v0}, Lg0/n;->j()V

    .line 136
    .line 137
    .line 138
    iget-object v0, p0, Lk0/f0;->i:Lg0/k;

    .line 139
    .line 140
    invoke-interface {v0, v2}, Lg0/k;->h(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    iget-object v0, p0, Lk0/f0;->t:LB0/e;

    .line 144
    .line 145
    iget-object v1, p0, Lk0/f0;->r:Ll0/a;

    .line 146
    .line 147
    invoke-interface {v0, v1}, LB0/e;->c(LB0/e$a;)V

    .line 148
    .line 149
    .line 150
    iget-object v0, p0, Lk0/f0;->u0:Lk0/U0;

    .line 151
    .line 152
    iget-boolean v1, v0, Lk0/U0;->p:Z

    .line 153
    .line 154
    if-eqz v1, :cond_3

    .line 155
    .line 156
    invoke-virtual {v0}, Lk0/U0;->a()Lk0/U0;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    iput-object v0, p0, Lk0/f0;->u0:Lk0/U0;

    .line 161
    .line 162
    :cond_3
    iget-object v0, p0, Lk0/f0;->u0:Lk0/U0;

    .line 163
    .line 164
    const/4 v1, 0x1

    .line 165
    invoke-virtual {v0, v1}, Lk0/U0;->h(I)Lk0/U0;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    iput-object v0, p0, Lk0/f0;->u0:Lk0/U0;

    .line 170
    .line 171
    iget-object v3, v0, Lk0/U0;->b:Lx0/x$b;

    .line 172
    .line 173
    invoke-virtual {v0, v3}, Lk0/U0;->c(Lx0/x$b;)Lk0/U0;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    iput-object v0, p0, Lk0/f0;->u0:Lk0/U0;

    .line 178
    .line 179
    iget-wide v3, v0, Lk0/U0;->s:J

    .line 180
    .line 181
    iput-wide v3, v0, Lk0/U0;->q:J

    .line 182
    .line 183
    iget-object v0, p0, Lk0/f0;->u0:Lk0/U0;

    .line 184
    .line 185
    const-wide/16 v3, 0x0

    .line 186
    .line 187
    iput-wide v3, v0, Lk0/U0;->r:J

    .line 188
    .line 189
    iget-object v0, p0, Lk0/f0;->r:Ll0/a;

    .line 190
    .line 191
    invoke-interface {v0}, Ll0/a;->release()V

    .line 192
    .line 193
    .line 194
    iget-object v0, p0, Lk0/f0;->h:LA0/D;

    .line 195
    .line 196
    invoke-virtual {v0}, LA0/D;->j()V

    .line 197
    .line 198
    .line 199
    invoke-virtual {p0}, Lk0/f0;->e2()V

    .line 200
    .line 201
    .line 202
    iget-object v0, p0, Lk0/f0;->Y:Landroid/view/Surface;

    .line 203
    .line 204
    if-eqz v0, :cond_4

    .line 205
    .line 206
    invoke-virtual {v0}, Landroid/view/Surface;->release()V

    .line 207
    .line 208
    .line 209
    iput-object v2, p0, Lk0/f0;->Y:Landroid/view/Surface;

    .line 210
    .line 211
    :cond_4
    iget-boolean v0, p0, Lk0/f0;->p0:Z

    .line 212
    .line 213
    if-nez v0, :cond_5

    .line 214
    .line 215
    sget-object v0, Lf0/b;->c:Lf0/b;

    .line 216
    .line 217
    iput-object v0, p0, Lk0/f0;->l0:Lf0/b;

    .line 218
    .line 219
    iput-boolean v1, p0, Lk0/f0;->q0:Z

    .line 220
    .line 221
    return-void

    .line 222
    :cond_5
    invoke-static {v2}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    invoke-static {v0}, Landroid/support/v4/media/a;->a(Ljava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    throw v2
.end method

.method public final s1(J)Ld0/D$e;
    .locals 13

    .line 1
    invoke-virtual {p0}, Lk0/f0;->E()I

    .line 2
    .line 3
    .line 4
    move-result v2

    .line 5
    iget-object v0, p0, Lk0/f0;->u0:Lk0/U0;

    .line 6
    .line 7
    iget-object v0, v0, Lk0/U0;->a:Ld0/I;

    .line 8
    .line 9
    invoke-virtual {v0}, Ld0/I;->q()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lk0/f0;->u0:Lk0/U0;

    .line 16
    .line 17
    iget-object v1, v0, Lk0/U0;->b:Lx0/x$b;

    .line 18
    .line 19
    iget-object v1, v1, Lx0/x$b;->a:Ljava/lang/Object;

    .line 20
    .line 21
    iget-object v0, v0, Lk0/U0;->a:Ld0/I;

    .line 22
    .line 23
    iget-object v3, p0, Lk0/f0;->n:Ld0/I$b;

    .line 24
    .line 25
    invoke-virtual {v0, v1, v3}, Ld0/I;->h(Ljava/lang/Object;Ld0/I$b;)Ld0/I$b;

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lk0/f0;->u0:Lk0/U0;

    .line 29
    .line 30
    iget-object v0, v0, Lk0/U0;->a:Ld0/I;

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ld0/I;->b(Ljava/lang/Object;)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget-object v3, p0, Lk0/f0;->u0:Lk0/U0;

    .line 37
    .line 38
    iget-object v3, v3, Lk0/U0;->a:Ld0/I;

    .line 39
    .line 40
    iget-object v4, p0, Ld0/f;->a:Ld0/I$c;

    .line 41
    .line 42
    invoke-virtual {v3, v2, v4}, Ld0/I;->n(ILd0/I$c;)Ld0/I$c;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    iget-object v3, v3, Ld0/I$c;->a:Ljava/lang/Object;

    .line 47
    .line 48
    iget-object v4, p0, Ld0/f;->a:Ld0/I$c;

    .line 49
    .line 50
    iget-object v4, v4, Ld0/I$c;->c:Ld0/u;

    .line 51
    .line 52
    move v5, v0

    .line 53
    move-object v12, v4

    .line 54
    move-object v4, v1

    .line 55
    move-object v1, v3

    .line 56
    move-object v3, v12

    .line 57
    goto :goto_0

    .line 58
    :cond_0
    const/4 v0, 0x0

    .line 59
    const/4 v1, -0x1

    .line 60
    move-object v3, v0

    .line 61
    move-object v4, v3

    .line 62
    move v5, v1

    .line 63
    move-object v1, v4

    .line 64
    :goto_0
    invoke-static {p1, p2}, Lg0/M;->i1(J)J

    .line 65
    .line 66
    .line 67
    move-result-wide v6

    .line 68
    new-instance p1, Ld0/D$e;

    .line 69
    .line 70
    iget-object p2, p0, Lk0/f0;->u0:Lk0/U0;

    .line 71
    .line 72
    iget-object p2, p2, Lk0/U0;->b:Lx0/x$b;

    .line 73
    .line 74
    invoke-virtual {p2}, Lx0/x$b;->b()Z

    .line 75
    .line 76
    .line 77
    move-result p2

    .line 78
    if-eqz p2, :cond_1

    .line 79
    .line 80
    iget-object p2, p0, Lk0/f0;->u0:Lk0/U0;

    .line 81
    .line 82
    invoke-static {p2}, Lk0/f0;->u1(Lk0/U0;)J

    .line 83
    .line 84
    .line 85
    move-result-wide v8

    .line 86
    invoke-static {v8, v9}, Lg0/M;->i1(J)J

    .line 87
    .line 88
    .line 89
    move-result-wide v8

    .line 90
    goto :goto_1

    .line 91
    :cond_1
    move-wide v8, v6

    .line 92
    :goto_1
    iget-object p2, p0, Lk0/f0;->u0:Lk0/U0;

    .line 93
    .line 94
    iget-object p2, p2, Lk0/U0;->b:Lx0/x$b;

    .line 95
    .line 96
    iget v10, p2, Lx0/x$b;->b:I

    .line 97
    .line 98
    iget v11, p2, Lx0/x$b;->c:I

    .line 99
    .line 100
    move-object v0, p1

    .line 101
    invoke-direct/range {v0 .. v11}, Ld0/D$e;-><init>(Ljava/lang/Object;ILd0/u;Ljava/lang/Object;IJJII)V

    .line 102
    .line 103
    .line 104
    return-object p1
.end method

.method public final s2(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public stop()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lk0/f0;->u2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lk0/f0;->B:Lk0/m;

    .line 5
    .line 6
    invoke-virtual {p0}, Lk0/f0;->u()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x1

    .line 11
    invoke-virtual {v0, v1, v2}, Lk0/m;->p(ZI)I

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    invoke-virtual {p0, v0}, Lk0/f0;->n2(Lk0/u;)V

    .line 16
    .line 17
    .line 18
    new-instance v0, Lf0/b;

    .line 19
    .line 20
    invoke-static {}, LX2/v;->Y()LX2/v;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    iget-object v2, p0, Lk0/f0;->u0:Lk0/U0;

    .line 25
    .line 26
    iget-wide v2, v2, Lk0/U0;->s:J

    .line 27
    .line 28
    invoke-direct {v0, v1, v2, v3}, Lf0/b;-><init>(Ljava/util/List;J)V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Lk0/f0;->l0:Lf0/b;

    .line 32
    .line 33
    return-void
.end method

.method public t()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lk0/f0;->u2()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lk0/f0;->o()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, Lk0/f0;->u0:Lk0/U0;

    .line 11
    .line 12
    iget-object v1, v0, Lk0/U0;->k:Lx0/x$b;

    .line 13
    .line 14
    iget-object v0, v0, Lk0/U0;->b:Lx0/x$b;

    .line 15
    .line 16
    invoke-virtual {v1, v0}, Lx0/x$b;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    iget-object v0, p0, Lk0/f0;->u0:Lk0/U0;

    .line 23
    .line 24
    iget-wide v0, v0, Lk0/U0;->q:J

    .line 25
    .line 26
    invoke-static {v0, v1}, Lg0/M;->i1(J)J

    .line 27
    .line 28
    .line 29
    move-result-wide v0

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-virtual {p0}, Lk0/f0;->K()J

    .line 32
    .line 33
    .line 34
    move-result-wide v0

    .line 35
    :goto_0
    return-wide v0

    .line 36
    :cond_1
    invoke-virtual {p0}, Lk0/f0;->m1()J

    .line 37
    .line 38
    .line 39
    move-result-wide v0

    .line 40
    return-wide v0
.end method

.method public final t1(ILk0/U0;I)Ld0/D$e;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    new-instance v2, Ld0/I$b;

    .line 6
    .line 7
    invoke-direct {v2}, Ld0/I$b;-><init>()V

    .line 8
    .line 9
    .line 10
    iget-object v3, v1, Lk0/U0;->a:Ld0/I;

    .line 11
    .line 12
    invoke-virtual {v3}, Ld0/I;->q()Z

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    const/4 v4, -0x1

    .line 17
    if-nez v3, :cond_0

    .line 18
    .line 19
    iget-object v3, v1, Lk0/U0;->b:Lx0/x$b;

    .line 20
    .line 21
    iget-object v3, v3, Lx0/x$b;->a:Ljava/lang/Object;

    .line 22
    .line 23
    iget-object v5, v1, Lk0/U0;->a:Ld0/I;

    .line 24
    .line 25
    invoke-virtual {v5, v3, v2}, Ld0/I;->h(Ljava/lang/Object;Ld0/I$b;)Ld0/I$b;

    .line 26
    .line 27
    .line 28
    iget v5, v2, Ld0/I$b;->c:I

    .line 29
    .line 30
    iget-object v6, v1, Lk0/U0;->a:Ld0/I;

    .line 31
    .line 32
    invoke-virtual {v6, v3}, Ld0/I;->b(Ljava/lang/Object;)I

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    iget-object v7, v1, Lk0/U0;->a:Ld0/I;

    .line 37
    .line 38
    iget-object v8, v0, Ld0/f;->a:Ld0/I$c;

    .line 39
    .line 40
    invoke-virtual {v7, v5, v8}, Ld0/I;->n(ILd0/I$c;)Ld0/I$c;

    .line 41
    .line 42
    .line 43
    move-result-object v7

    .line 44
    iget-object v7, v7, Ld0/I$c;->a:Ljava/lang/Object;

    .line 45
    .line 46
    iget-object v8, v0, Ld0/f;->a:Ld0/I$c;

    .line 47
    .line 48
    iget-object v8, v8, Ld0/I$c;->c:Ld0/u;

    .line 49
    .line 50
    move-object v9, v3

    .line 51
    move v10, v6

    .line 52
    move-object v6, v7

    .line 53
    move v7, v5

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    const/4 v3, 0x0

    .line 56
    move/from16 v7, p3

    .line 57
    .line 58
    move-object v6, v3

    .line 59
    move-object v8, v6

    .line 60
    move-object v9, v8

    .line 61
    move v10, v4

    .line 62
    :goto_0
    iget-object v3, v1, Lk0/U0;->b:Lx0/x$b;

    .line 63
    .line 64
    invoke-virtual {v3}, Lx0/x$b;->b()Z

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-nez p1, :cond_3

    .line 69
    .line 70
    if-eqz v3, :cond_1

    .line 71
    .line 72
    iget-object v3, v1, Lk0/U0;->b:Lx0/x$b;

    .line 73
    .line 74
    iget v4, v3, Lx0/x$b;->b:I

    .line 75
    .line 76
    iget v3, v3, Lx0/x$b;->c:I

    .line 77
    .line 78
    invoke-virtual {v2, v4, v3}, Ld0/I$b;->b(II)J

    .line 79
    .line 80
    .line 81
    move-result-wide v2

    .line 82
    :goto_1
    invoke-static/range {p2 .. p2}, Lk0/f0;->u1(Lk0/U0;)J

    .line 83
    .line 84
    .line 85
    move-result-wide v4

    .line 86
    goto :goto_3

    .line 87
    :cond_1
    iget-object v3, v1, Lk0/U0;->b:Lx0/x$b;

    .line 88
    .line 89
    iget v3, v3, Lx0/x$b;->e:I

    .line 90
    .line 91
    if-eq v3, v4, :cond_2

    .line 92
    .line 93
    iget-object v2, v0, Lk0/f0;->u0:Lk0/U0;

    .line 94
    .line 95
    invoke-static {v2}, Lk0/f0;->u1(Lk0/U0;)J

    .line 96
    .line 97
    .line 98
    move-result-wide v2

    .line 99
    :goto_2
    move-wide v4, v2

    .line 100
    goto :goto_3

    .line 101
    :cond_2
    iget-wide v3, v2, Ld0/I$b;->e:J

    .line 102
    .line 103
    iget-wide v11, v2, Ld0/I$b;->d:J

    .line 104
    .line 105
    add-long v2, v3, v11

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_3
    if-eqz v3, :cond_4

    .line 109
    .line 110
    iget-wide v2, v1, Lk0/U0;->s:J

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_4
    iget-wide v2, v2, Ld0/I$b;->e:J

    .line 114
    .line 115
    iget-wide v4, v1, Lk0/U0;->s:J

    .line 116
    .line 117
    add-long/2addr v2, v4

    .line 118
    goto :goto_2

    .line 119
    :goto_3
    new-instance v17, Ld0/D$e;

    .line 120
    .line 121
    invoke-static {v2, v3}, Lg0/M;->i1(J)J

    .line 122
    .line 123
    .line 124
    move-result-wide v11

    .line 125
    invoke-static {v4, v5}, Lg0/M;->i1(J)J

    .line 126
    .line 127
    .line 128
    move-result-wide v13

    .line 129
    iget-object v1, v1, Lk0/U0;->b:Lx0/x$b;

    .line 130
    .line 131
    iget v15, v1, Lx0/x$b;->b:I

    .line 132
    .line 133
    iget v1, v1, Lx0/x$b;->c:I

    .line 134
    .line 135
    move-object/from16 v5, v17

    .line 136
    .line 137
    move/from16 v16, v1

    .line 138
    .line 139
    invoke-direct/range {v5 .. v16}, Ld0/D$e;-><init>(Ljava/lang/Object;ILd0/u;Ljava/lang/Object;IJJII)V

    .line 140
    .line 141
    .line 142
    return-object v17
.end method

.method public final t2()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lk0/f0;->f()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    if-eq v0, v1, :cond_3

    .line 8
    .line 9
    const/4 v3, 0x2

    .line 10
    if-eq v0, v3, :cond_1

    .line 11
    .line 12
    const/4 v3, 0x3

    .line 13
    if-eq v0, v3, :cond_1

    .line 14
    .line 15
    const/4 v1, 0x4

    .line 16
    if-ne v0, v1, :cond_0

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 22
    .line 23
    .line 24
    throw v0

    .line 25
    :cond_1
    invoke-virtual {p0}, Lk0/f0;->y1()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    iget-object v3, p0, Lk0/f0;->D:Lk0/i1;

    .line 30
    .line 31
    invoke-virtual {p0}, Lk0/f0;->u()Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-eqz v4, :cond_2

    .line 36
    .line 37
    if-nez v0, :cond_2

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    move v1, v2

    .line 41
    :goto_0
    invoke-virtual {v3, v1}, Lk0/i1;->b(Z)V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Lk0/f0;->E:Lk0/j1;

    .line 45
    .line 46
    invoke-virtual {p0}, Lk0/f0;->u()Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    invoke-virtual {v0, v1}, Lk0/j1;->b(Z)V

    .line 51
    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_3
    :goto_1
    iget-object v0, p0, Lk0/f0;->D:Lk0/i1;

    .line 55
    .line 56
    invoke-virtual {v0, v2}, Lk0/i1;->b(Z)V

    .line 57
    .line 58
    .line 59
    iget-object v0, p0, Lk0/f0;->E:Lk0/j1;

    .line 60
    .line 61
    invoke-virtual {v0, v2}, Lk0/j1;->b(Z)V

    .line 62
    .line 63
    .line 64
    :goto_2
    return-void
.end method

.method public u()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lk0/f0;->u2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lk0/f0;->u0:Lk0/U0;

    .line 5
    .line 6
    iget-boolean v0, v0, Lk0/U0;->l:Z

    .line 7
    .line 8
    return v0
.end method

.method public final u2()V
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-object v1, p0, Lk0/f0;->d:Lg0/f;

    .line 3
    .line 4
    invoke-virtual {v1}, Lg0/f;->b()V

    .line 5
    .line 6
    .line 7
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {p0}, Lk0/f0;->l1()Landroid/os/Looper;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v2}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    if-eq v1, v2, :cond_2

    .line 20
    .line 21
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {p0}, Lk0/f0;->l1()Landroid/os/Looper;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v2}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    const/4 v3, 0x2

    .line 42
    new-array v3, v3, [Ljava/lang/Object;

    .line 43
    .line 44
    const/4 v4, 0x0

    .line 45
    aput-object v1, v3, v4

    .line 46
    .line 47
    aput-object v2, v3, v0

    .line 48
    .line 49
    const-string v1, "Player is accessed on the wrong thread.\nCurrent thread: \'%s\'\nExpected thread: \'%s\'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread"

    .line 50
    .line 51
    invoke-static {v1, v3}, Lg0/M;->G(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    iget-boolean v2, p0, Lk0/f0;->m0:Z

    .line 56
    .line 57
    if-nez v2, :cond_1

    .line 58
    .line 59
    iget-boolean v2, p0, Lk0/f0;->n0:Z

    .line 60
    .line 61
    if-eqz v2, :cond_0

    .line 62
    .line 63
    const/4 v2, 0x0

    .line 64
    goto :goto_0

    .line 65
    :cond_0
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 66
    .line 67
    invoke-direct {v2}, Ljava/lang/IllegalStateException;-><init>()V

    .line 68
    .line 69
    .line 70
    :goto_0
    const-string v3, "ExoPlayerImpl"

    .line 71
    .line 72
    invoke-static {v3, v1, v2}, Lg0/o;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 73
    .line 74
    .line 75
    iput-boolean v0, p0, Lk0/f0;->n0:Z

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 79
    .line 80
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw v0

    .line 84
    :cond_2
    :goto_1
    return-void
.end method

.method public v(Ld0/D$d;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lk0/f0;->l:Lg0/n;

    .line 2
    .line 3
    invoke-static {p1}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ld0/D$d;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lg0/n;->c(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final v1(Lk0/t0$e;)V
    .locals 11

    .line 1
    iget v1, p0, Lk0/f0;->K:I

    .line 2
    .line 3
    iget v2, p1, Lk0/t0$e;->c:I

    .line 4
    .line 5
    sub-int/2addr v1, v2

    .line 6
    iput v1, p0, Lk0/f0;->K:I

    .line 7
    .line 8
    iget-boolean v2, p1, Lk0/t0$e;->d:Z

    .line 9
    .line 10
    const/4 v3, 0x1

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    iget v2, p1, Lk0/t0$e;->e:I

    .line 14
    .line 15
    iput v2, p0, Lk0/f0;->L:I

    .line 16
    .line 17
    iput-boolean v3, p0, Lk0/f0;->M:Z

    .line 18
    .line 19
    :cond_0
    if-nez v1, :cond_a

    .line 20
    .line 21
    iget-object v1, p1, Lk0/t0$e;->b:Lk0/U0;

    .line 22
    .line 23
    iget-object v1, v1, Lk0/U0;->a:Ld0/I;

    .line 24
    .line 25
    iget-object v2, p0, Lk0/f0;->u0:Lk0/U0;

    .line 26
    .line 27
    iget-object v2, v2, Lk0/U0;->a:Ld0/I;

    .line 28
    .line 29
    invoke-virtual {v2}, Ld0/I;->q()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    const/4 v4, 0x0

    .line 34
    if-nez v2, :cond_1

    .line 35
    .line 36
    invoke-virtual {v1}, Ld0/I;->q()Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_1

    .line 41
    .line 42
    const/4 v2, -0x1

    .line 43
    iput v2, p0, Lk0/f0;->v0:I

    .line 44
    .line 45
    const-wide/16 v5, 0x0

    .line 46
    .line 47
    iput-wide v5, p0, Lk0/f0;->x0:J

    .line 48
    .line 49
    iput v4, p0, Lk0/f0;->w0:I

    .line 50
    .line 51
    :cond_1
    invoke-virtual {v1}, Ld0/I;->q()Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-nez v2, :cond_3

    .line 56
    .line 57
    move-object v2, v1

    .line 58
    check-cast v2, Lk0/W0;

    .line 59
    .line 60
    invoke-virtual {v2}, Lk0/W0;->F()Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    iget-object v6, p0, Lk0/f0;->o:Ljava/util/List;

    .line 69
    .line 70
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 71
    .line 72
    .line 73
    move-result v6

    .line 74
    if-ne v5, v6, :cond_2

    .line 75
    .line 76
    move v5, v3

    .line 77
    goto :goto_0

    .line 78
    :cond_2
    move v5, v4

    .line 79
    :goto_0
    invoke-static {v5}, Lg0/a;->f(Z)V

    .line 80
    .line 81
    .line 82
    move v5, v4

    .line 83
    :goto_1
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 84
    .line 85
    .line 86
    move-result v6

    .line 87
    if-ge v5, v6, :cond_3

    .line 88
    .line 89
    iget-object v6, p0, Lk0/f0;->o:Ljava/util/List;

    .line 90
    .line 91
    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v6

    .line 95
    check-cast v6, Lk0/f0$f;

    .line 96
    .line 97
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v7

    .line 101
    check-cast v7, Ld0/I;

    .line 102
    .line 103
    invoke-virtual {v6, v7}, Lk0/f0$f;->c(Ld0/I;)V

    .line 104
    .line 105
    .line 106
    add-int/lit8 v5, v5, 0x1

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_3
    iget-boolean v2, p0, Lk0/f0;->M:Z

    .line 110
    .line 111
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    if-eqz v2, :cond_8

    .line 117
    .line 118
    iget-object v2, p1, Lk0/t0$e;->b:Lk0/U0;

    .line 119
    .line 120
    iget-object v2, v2, Lk0/U0;->b:Lx0/x$b;

    .line 121
    .line 122
    iget-object v7, p0, Lk0/f0;->u0:Lk0/U0;

    .line 123
    .line 124
    iget-object v7, v7, Lk0/U0;->b:Lx0/x$b;

    .line 125
    .line 126
    invoke-virtual {v2, v7}, Lx0/x$b;->equals(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    if-eqz v2, :cond_5

    .line 131
    .line 132
    iget-object v2, p1, Lk0/t0$e;->b:Lk0/U0;

    .line 133
    .line 134
    iget-wide v7, v2, Lk0/U0;->d:J

    .line 135
    .line 136
    iget-object v2, p0, Lk0/f0;->u0:Lk0/U0;

    .line 137
    .line 138
    iget-wide v9, v2, Lk0/U0;->s:J

    .line 139
    .line 140
    cmp-long v2, v7, v9

    .line 141
    .line 142
    if-eqz v2, :cond_4

    .line 143
    .line 144
    goto :goto_2

    .line 145
    :cond_4
    move v3, v4

    .line 146
    :cond_5
    :goto_2
    if-eqz v3, :cond_9

    .line 147
    .line 148
    invoke-virtual {v1}, Ld0/I;->q()Z

    .line 149
    .line 150
    .line 151
    move-result v2

    .line 152
    if-nez v2, :cond_7

    .line 153
    .line 154
    iget-object v2, p1, Lk0/t0$e;->b:Lk0/U0;

    .line 155
    .line 156
    iget-object v2, v2, Lk0/U0;->b:Lx0/x$b;

    .line 157
    .line 158
    invoke-virtual {v2}, Lx0/x$b;->b()Z

    .line 159
    .line 160
    .line 161
    move-result v2

    .line 162
    if-eqz v2, :cond_6

    .line 163
    .line 164
    goto :goto_3

    .line 165
    :cond_6
    iget-object v2, p1, Lk0/t0$e;->b:Lk0/U0;

    .line 166
    .line 167
    iget-object v5, v2, Lk0/U0;->b:Lx0/x$b;

    .line 168
    .line 169
    iget-wide v6, v2, Lk0/U0;->d:J

    .line 170
    .line 171
    invoke-virtual {p0, v1, v5, v6, v7}, Lk0/f0;->c2(Ld0/I;Lx0/x$b;J)J

    .line 172
    .line 173
    .line 174
    move-result-wide v1

    .line 175
    goto :goto_4

    .line 176
    :cond_7
    :goto_3
    iget-object v1, p1, Lk0/t0$e;->b:Lk0/U0;

    .line 177
    .line 178
    iget-wide v1, v1, Lk0/U0;->d:J

    .line 179
    .line 180
    :goto_4
    move-wide v5, v1

    .line 181
    goto :goto_5

    .line 182
    :cond_8
    move v3, v4

    .line 183
    :cond_9
    :goto_5
    iput-boolean v4, p0, Lk0/f0;->M:Z

    .line 184
    .line 185
    iget-object v1, p1, Lk0/t0$e;->b:Lk0/U0;

    .line 186
    .line 187
    iget v4, p0, Lk0/f0;->L:I

    .line 188
    .line 189
    const/4 v7, -0x1

    .line 190
    const/4 v8, 0x0

    .line 191
    const/4 v2, 0x1

    .line 192
    move-object v0, p0

    .line 193
    invoke-virtual/range {v0 .. v8}, Lk0/f0;->q2(Lk0/U0;IZIJIZ)V

    .line 194
    .line 195
    .line 196
    :cond_a
    return-void
.end method

.method public final w1()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lk0/f0;->G:Landroid/media/AudioManager;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    sget v1, Lg0/M;->a:I

    .line 6
    .line 7
    const/16 v2, 0x17

    .line 8
    .line 9
    if-ge v1, v2, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v1, p0, Lk0/f0;->e:Landroid/content/Context;

    .line 13
    .line 14
    const/4 v2, 0x2

    .line 15
    invoke-virtual {v0, v2}, Landroid/media/AudioManager;->getDevices(I)[Landroid/media/AudioDeviceInfo;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v1, v0}, Lk0/f0$b;->a(Landroid/content/Context;[Landroid/media/AudioDeviceInfo;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    return v0

    .line 24
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 25
    return v0
.end method

.method public x(Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lk0/f0;->u2()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lk0/f0;->J:Z

    .line 5
    .line 6
    if-eq v0, p1, :cond_0

    .line 7
    .line 8
    iput-boolean p1, p0, Lk0/f0;->J:Z

    .line 9
    .line 10
    iget-object v0, p0, Lk0/f0;->k:Lk0/t0;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lk0/t0;->i1(Z)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lk0/f0;->l:Lg0/n;

    .line 16
    .line 17
    new-instance v1, Lk0/N;

    .line 18
    .line 19
    invoke-direct {v1, p1}, Lk0/N;-><init>(Z)V

    .line 20
    .line 21
    .line 22
    const/16 p1, 0x9

    .line 23
    .line 24
    invoke-virtual {v0, p1, v1}, Lg0/n;->i(ILg0/n$a;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lk0/f0;->o2()V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lk0/f0;->l:Lg0/n;

    .line 31
    .line 32
    invoke-virtual {p1}, Lg0/n;->f()V

    .line 33
    .line 34
    .line 35
    :cond_0
    return-void
.end method

.method public final x1(I)I
    .locals 9

    .line 1
    iget-object v0, p0, Lk0/f0;->W:Landroid/media/AudioTrack;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/media/AudioTrack;->getAudioSessionId()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eq v0, p1, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lk0/f0;->W:Landroid/media/AudioTrack;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/media/AudioTrack;->release()V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    iput-object v0, p0, Lk0/f0;->W:Landroid/media/AudioTrack;

    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Lk0/f0;->W:Landroid/media/AudioTrack;

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    new-instance v0, Landroid/media/AudioTrack;

    .line 24
    .line 25
    const/4 v2, 0x3

    .line 26
    const/4 v7, 0x0

    .line 27
    const/16 v3, 0xfa0

    .line 28
    .line 29
    const/4 v4, 0x4

    .line 30
    const/4 v5, 0x2

    .line 31
    const/4 v6, 0x2

    .line 32
    move-object v1, v0

    .line 33
    move v8, p1

    .line 34
    invoke-direct/range {v1 .. v8}, Landroid/media/AudioTrack;-><init>(IIIIIII)V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, Lk0/f0;->W:Landroid/media/AudioTrack;

    .line 38
    .line 39
    :cond_1
    iget-object p1, p0, Lk0/f0;->W:Landroid/media/AudioTrack;

    .line 40
    .line 41
    invoke-virtual {p1}, Landroid/media/AudioTrack;->getAudioSessionId()I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    return p1
.end method

.method public y1()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lk0/f0;->u2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lk0/f0;->u0:Lk0/U0;

    .line 5
    .line 6
    iget-boolean v0, v0, Lk0/U0;->p:Z

    .line 7
    .line 8
    return v0
.end method

.method public z()Ld0/L;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lk0/f0;->u2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lk0/f0;->u0:Lk0/U0;

    .line 5
    .line 6
    iget-object v0, v0, Lk0/U0;->i:LA0/E;

    .line 7
    .line 8
    iget-object v0, v0, LA0/E;->d:Ld0/L;

    .line 9
    .line 10
    return-object v0
.end method
